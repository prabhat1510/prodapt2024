package java17features.recordclasses.serializeexample;

import java.io.Serializable;

public record RangeRecord (int lo, int hi) implements Serializable { 
	
}