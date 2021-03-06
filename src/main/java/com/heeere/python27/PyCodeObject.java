package com.heeere.python27;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : code.h:23</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyCodeObject extends StructObject {
	public PyCodeObject() {
		super();
	}
	/// C type : Py_ssize_t
	@Ptr 
	@Field(0) 
	public long ob_refcnt() {
		return this.io.getSizeTField(this, 0);
	}
	/// C type : Py_ssize_t
	@Ptr 
	@Field(0) 
	public PyCodeObject ob_refcnt(long ob_refcnt) {
		this.io.setSizeTField(this, 0, ob_refcnt);
		return this;
	}
	/// C type : _typeobject*
	@Field(1) 
	public Pointer<PyTypeObject > ob_type() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : _typeobject*
	@Field(1) 
	public PyCodeObject ob_type(Pointer<PyTypeObject > ob_type) {
		this.io.setPointerField(this, 1, ob_type);
		return this;
	}
	/// #arguments, except *args
	@Field(2) 
	public int co_argcount() {
		return this.io.getIntField(this, 2);
	}
	/// #arguments, except *args
	@Field(2) 
	public PyCodeObject co_argcount(int co_argcount) {
		this.io.setIntField(this, 2, co_argcount);
		return this;
	}
	/// #local variables
	@Field(3) 
	public int co_nlocals() {
		return this.io.getIntField(this, 3);
	}
	/// #local variables
	@Field(3) 
	public PyCodeObject co_nlocals(int co_nlocals) {
		this.io.setIntField(this, 3, co_nlocals);
		return this;
	}
	/// #entries needed for evaluation stack
	@Field(4) 
	public int co_stacksize() {
		return this.io.getIntField(this, 4);
	}
	/// #entries needed for evaluation stack
	@Field(4) 
	public PyCodeObject co_stacksize(int co_stacksize) {
		this.io.setIntField(this, 4, co_stacksize);
		return this;
	}
	/// CO_..., see below
	@Field(5) 
	public int co_flags() {
		return this.io.getIntField(this, 5);
	}
	/// CO_..., see below
	@Field(5) 
	public PyCodeObject co_flags(int co_flags) {
		this.io.setIntField(this, 5, co_flags);
		return this;
	}
	/**
	 * instruction opcodes<br>
	 * C type : PyObject*
	 */
	@Field(6) 
	public Pointer<PyObject > co_code() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * instruction opcodes<br>
	 * C type : PyObject*
	 */
	@Field(6) 
	public PyCodeObject co_code(Pointer<PyObject > co_code) {
		this.io.setPointerField(this, 6, co_code);
		return this;
	}
	/**
	 * list (constants used)<br>
	 * C type : PyObject*
	 */
	@Field(7) 
	public Pointer<PyObject > co_consts() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * list (constants used)<br>
	 * C type : PyObject*
	 */
	@Field(7) 
	public PyCodeObject co_consts(Pointer<PyObject > co_consts) {
		this.io.setPointerField(this, 7, co_consts);
		return this;
	}
	/**
	 * list of strings (names used)<br>
	 * C type : PyObject*
	 */
	@Field(8) 
	public Pointer<PyObject > co_names() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * list of strings (names used)<br>
	 * C type : PyObject*
	 */
	@Field(8) 
	public PyCodeObject co_names(Pointer<PyObject > co_names) {
		this.io.setPointerField(this, 8, co_names);
		return this;
	}
	/**
	 * tuple of strings (local variable names)<br>
	 * C type : PyObject*
	 */
	@Field(9) 
	public Pointer<PyObject > co_varnames() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * tuple of strings (local variable names)<br>
	 * C type : PyObject*
	 */
	@Field(9) 
	public PyCodeObject co_varnames(Pointer<PyObject > co_varnames) {
		this.io.setPointerField(this, 9, co_varnames);
		return this;
	}
	/**
	 * tuple of strings (free variable names)<br>
	 * C type : PyObject*
	 */
	@Field(10) 
	public Pointer<PyObject > co_freevars() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * tuple of strings (free variable names)<br>
	 * C type : PyObject*
	 */
	@Field(10) 
	public PyCodeObject co_freevars(Pointer<PyObject > co_freevars) {
		this.io.setPointerField(this, 10, co_freevars);
		return this;
	}
	/**
	 * tuple of strings (cell variable names)<br>
	 * C type : PyObject*
	 */
	@Field(11) 
	public Pointer<PyObject > co_cellvars() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * tuple of strings (cell variable names)<br>
	 * C type : PyObject*
	 */
	@Field(11) 
	public PyCodeObject co_cellvars(Pointer<PyObject > co_cellvars) {
		this.io.setPointerField(this, 11, co_cellvars);
		return this;
	}
	/**
	 * The rest doesn't count for hash/cmp<br>
	 * string (where it was loaded from)<br>
	 * C type : PyObject*
	 */
	@Field(12) 
	public Pointer<PyObject > co_filename() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * The rest doesn't count for hash/cmp<br>
	 * string (where it was loaded from)<br>
	 * C type : PyObject*
	 */
	@Field(12) 
	public PyCodeObject co_filename(Pointer<PyObject > co_filename) {
		this.io.setPointerField(this, 12, co_filename);
		return this;
	}
	/**
	 * string (name, for reference)<br>
	 * C type : PyObject*
	 */
	@Field(13) 
	public Pointer<PyObject > co_name() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * string (name, for reference)<br>
	 * C type : PyObject*
	 */
	@Field(13) 
	public PyCodeObject co_name(Pointer<PyObject > co_name) {
		this.io.setPointerField(this, 13, co_name);
		return this;
	}
	/// first source line number
	@Field(14) 
	public int co_firstlineno() {
		return this.io.getIntField(this, 14);
	}
	/// first source line number
	@Field(14) 
	public PyCodeObject co_firstlineno(int co_firstlineno) {
		this.io.setIntField(this, 14, co_firstlineno);
		return this;
	}
	/**
	 * string (encoding addr<->lineno mapping) See<br>
	 * Objects/lnotab_notes.txt for details.<br>
	 * C type : PyObject*
	 */
	@Field(15) 
	public Pointer<PyObject > co_lnotab() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * string (encoding addr<->lineno mapping) See<br>
	 * Objects/lnotab_notes.txt for details.<br>
	 * C type : PyObject*
	 */
	@Field(15) 
	public PyCodeObject co_lnotab(Pointer<PyObject > co_lnotab) {
		this.io.setPointerField(this, 15, co_lnotab);
		return this;
	}
	/**
	 * for optimization only (see frameobject.c)<br>
	 * C type : void*
	 */
	@Field(16) 
	public Pointer<? > co_zombieframe() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * for optimization only (see frameobject.c)<br>
	 * C type : void*
	 */
	@Field(16) 
	public PyCodeObject co_zombieframe(Pointer<? > co_zombieframe) {
		this.io.setPointerField(this, 16, co_zombieframe);
		return this;
	}
	/**
	 * to support weakrefs to code objects<br>
	 * C type : PyObject*
	 */
	@Field(17) 
	public Pointer<PyObject > co_weakreflist() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * to support weakrefs to code objects<br>
	 * C type : PyObject*
	 */
	@Field(17) 
	public PyCodeObject co_weakreflist(Pointer<PyObject > co_weakreflist) {
		this.io.setPointerField(this, 17, co_weakreflist);
		return this;
	}
	public PyCodeObject(Pointer pointer) {
		super(pointer);
	}
}
