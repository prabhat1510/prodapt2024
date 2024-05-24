import { createServer } from 'node:http';

//require("url");
const hostname = '127.0.0.1';
const port = 3000;
/**
const server = createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello World');
});
*/
//const { url, headers } = request



const server = createServer((request, response) => {
  // [1]
  const { method, url, headers } = request
  const url1 =url.split('?')[0];
  
  // [2]
  if (method === "GET" && url1 === "/cats") {
    const queryParams = request.url.split('?')[1];
  //console.log(url);
  // Parse the query parameters into an object
  const params = {};
  queryParams.split('&').forEach(param => {
    const [key, value] = param.split('=');
    params[key] = value;
  });
  //console.log(params);
    
    
    response.statusCode = 200
    response.setHeader("Content-Type", "application/json")
    const responseBody = {
      headers,
      method,
      url,
      //body: ["Mrs. Meowsers", "Hairball", "Jerk"]
      body: params["id"]
    }

    response.write(JSON.stringify(responseBody))
    response.end()
  }
})
server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});