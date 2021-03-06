package com.heeere.python27;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : object.h:348</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class _Py_HashSecret_t extends StructObject {
	public _Py_HashSecret_t() {
		super();
	}
	@CLong 
	@Field(0) 
	public long prefix() {
		return this.io.getCLongField(this, 0);
	}
	@CLong 
	@Field(0) 
	public _Py_HashSecret_t prefix(long prefix) {
		this.io.setCLongField(this, 0, prefix);
		return this;
	}
	@CLong 
	@Field(1) 
	public long suffix() {
		return this.io.getCLongField(this, 1);
	}
	@CLong 
	@Field(1) 
	public _Py_HashSecret_t suffix(long suffix) {
		this.io.setCLongField(this, 1, suffix);
		return this;
	}
	public _Py_HashSecret_t(Pointer pointer) {
		super(pointer);
	}
}
