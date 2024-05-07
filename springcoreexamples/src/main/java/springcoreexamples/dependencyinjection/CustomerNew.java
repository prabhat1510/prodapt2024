package springcoreexamples.dependencyinjection;

public class CustomerNew implements IAddressInjector {
	IAddress iaddress;

	public void injectAddress(IAddress address) {
		this.iaddress= address;
		
	}

}
