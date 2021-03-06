package edu.uminho.biosynth.core.data.integration.generator;

import java.io.Serializable;

public interface IKeyGenerator<T extends Serializable> {
	public void generateFromLastElement(T key);
	public T getCurrentKey();
	public T generateKey();
	public void reset();
}
