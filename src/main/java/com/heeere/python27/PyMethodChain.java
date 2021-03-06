package com.heeere.python27;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : methodobject.h:28</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyMethodChain extends StructObject {
	public PyMethodChain() {
		super();
	}
	/**
	 * Methods of this type<br>
	 * C type : PyMethodDef*
	 */
	@Field(0) 
	public Pointer<PyMethodDef > methods() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * Methods of this type<br>
	 * C type : PyMethodDef*
	 */
	@Field(0) 
	public PyMethodChain methods(Pointer<PyMethodDef > methods) {
		this.io.setPointerField(this, 0, methods);
		return this;
	}
	/**
	 * NULL or base type<br>
	 * C type : PyMethodChain*
	 */
	@Field(1) 
	public Pointer<PyMethodChain > link() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * NULL or base type<br>
	 * C type : PyMethodChain*
	 */
	@Field(1) 
	public PyMethodChain link(Pointer<PyMethodChain > link) {
		this.io.setPointerField(this, 1, link);
		return this;
	}
	public PyMethodChain(Pointer pointer) {
		super(pointer);
	}
}
