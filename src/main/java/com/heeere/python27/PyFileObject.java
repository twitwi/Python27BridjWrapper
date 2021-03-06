package com.heeere.python27;
import com.heeere.python27.Python27Library.FILE;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : fileobject.h:26</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyFileObject extends StructObject {
	public PyFileObject() {
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
	public PyFileObject ob_refcnt(long ob_refcnt) {
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
	public PyFileObject ob_type(Pointer<PyTypeObject > ob_type) {
		this.io.setPointerField(this, 1, ob_type);
		return this;
	}
	/// C type : FILE*
	@Field(2) 
	public Pointer<FILE > f_fp() {
		return this.io.getPointerField(this, 2);
	}
	/// C type : FILE*
	@Field(2) 
	public PyFileObject f_fp(Pointer<FILE > f_fp) {
		this.io.setPointerField(this, 2, f_fp);
		return this;
	}
	/// C type : PyObject*
	@Field(3) 
	public Pointer<PyObject > f_name() {
		return this.io.getPointerField(this, 3);
	}
	/// C type : PyObject*
	@Field(3) 
	public PyFileObject f_name(Pointer<PyObject > f_name) {
		this.io.setPointerField(this, 3, f_name);
		return this;
	}
	/// C type : PyObject*
	@Field(4) 
	public Pointer<PyObject > f_mode() {
		return this.io.getPointerField(this, 4);
	}
	/// C type : PyObject*
	@Field(4) 
	public PyFileObject f_mode(Pointer<PyObject > f_mode) {
		this.io.setPointerField(this, 4, f_mode);
		return this;
	}
	/// C type : f_close_callback
	@Field(5) 
	public Pointer<PyFileObject.f_close_callback > f_close() {
		return this.io.getPointerField(this, 5);
	}
	/// C type : f_close_callback
	@Field(5) 
	public PyFileObject f_close(Pointer<PyFileObject.f_close_callback > f_close) {
		this.io.setPointerField(this, 5, f_close);
		return this;
	}
	/// Flag used by 'print' command
	@Field(6) 
	public int f_softspace() {
		return this.io.getIntField(this, 6);
	}
	/// Flag used by 'print' command
	@Field(6) 
	public PyFileObject f_softspace(int f_softspace) {
		this.io.setIntField(this, 6, f_softspace);
		return this;
	}
	/**
	 * Flag which indicates whether the file is<br>
	 * open in binary (1) or text (0) mode
	 */
	@Field(7) 
	public int f_binary() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * Flag which indicates whether the file is<br>
	 * open in binary (1) or text (0) mode
	 */
	@Field(7) 
	public PyFileObject f_binary(int f_binary) {
		this.io.setIntField(this, 7, f_binary);
		return this;
	}
	/**
	 * Allocated readahead buffer<br>
	 * C type : char*
	 */
	@Field(8) 
	public Pointer<Byte > f_buf() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * Allocated readahead buffer<br>
	 * C type : char*
	 */
	@Field(8) 
	public PyFileObject f_buf(Pointer<Byte > f_buf) {
		this.io.setPointerField(this, 8, f_buf);
		return this;
	}
	/**
	 * Points after last occupied position<br>
	 * C type : char*
	 */
	@Field(9) 
	public Pointer<Byte > f_bufend() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * Points after last occupied position<br>
	 * C type : char*
	 */
	@Field(9) 
	public PyFileObject f_bufend(Pointer<Byte > f_bufend) {
		this.io.setPointerField(this, 9, f_bufend);
		return this;
	}
	/**
	 * Current buffer position<br>
	 * C type : char*
	 */
	@Field(10) 
	public Pointer<Byte > f_bufptr() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * Current buffer position<br>
	 * C type : char*
	 */
	@Field(10) 
	public PyFileObject f_bufptr(Pointer<Byte > f_bufptr) {
		this.io.setPointerField(this, 10, f_bufptr);
		return this;
	}
	/**
	 * Buffer for setbuf(3) and setvbuf(3)<br>
	 * C type : char*
	 */
	@Field(11) 
	public Pointer<Byte > f_setbuf() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * Buffer for setbuf(3) and setvbuf(3)<br>
	 * C type : char*
	 */
	@Field(11) 
	public PyFileObject f_setbuf(Pointer<Byte > f_setbuf) {
		this.io.setPointerField(this, 11, f_setbuf);
		return this;
	}
	/// Handle any newline convention
	@Field(12) 
	public int f_univ_newline() {
		return this.io.getIntField(this, 12);
	}
	/// Handle any newline convention
	@Field(12) 
	public PyFileObject f_univ_newline(int f_univ_newline) {
		this.io.setIntField(this, 12, f_univ_newline);
		return this;
	}
	/// Types of newlines seen
	@Field(13) 
	public int f_newlinetypes() {
		return this.io.getIntField(this, 13);
	}
	/// Types of newlines seen
	@Field(13) 
	public PyFileObject f_newlinetypes(int f_newlinetypes) {
		this.io.setIntField(this, 13, f_newlinetypes);
		return this;
	}
	/// Skip next \n
	@Field(14) 
	public int f_skipnextlf() {
		return this.io.getIntField(this, 14);
	}
	/// Skip next \n
	@Field(14) 
	public PyFileObject f_skipnextlf(int f_skipnextlf) {
		this.io.setIntField(this, 14, f_skipnextlf);
		return this;
	}
	/// C type : PyObject*
	@Field(15) 
	public Pointer<PyObject > f_encoding() {
		return this.io.getPointerField(this, 15);
	}
	/// C type : PyObject*
	@Field(15) 
	public PyFileObject f_encoding(Pointer<PyObject > f_encoding) {
		this.io.setPointerField(this, 15, f_encoding);
		return this;
	}
	/// C type : PyObject*
	@Field(16) 
	public Pointer<PyObject > f_errors() {
		return this.io.getPointerField(this, 16);
	}
	/// C type : PyObject*
	@Field(16) 
	public PyFileObject f_errors(Pointer<PyObject > f_errors) {
		this.io.setPointerField(this, 16, f_errors);
		return this;
	}
	/**
	 * List of weak references<br>
	 * C type : PyObject*
	 */
	@Field(17) 
	public Pointer<PyObject > weakreflist() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * List of weak references<br>
	 * C type : PyObject*
	 */
	@Field(17) 
	public PyFileObject weakreflist(Pointer<PyObject > weakreflist) {
		this.io.setPointerField(this, 17, weakreflist);
		return this;
	}
	/**
	 * Num. currently running sections of code<br>
	 * using f_fp with the GIL released.
	 */
	@Field(18) 
	public int unlocked_count() {
		return this.io.getIntField(this, 18);
	}
	/**
	 * Num. currently running sections of code<br>
	 * using f_fp with the GIL released.
	 */
	@Field(18) 
	public PyFileObject unlocked_count(int unlocked_count) {
		this.io.setIntField(this, 18, unlocked_count);
		return this;
	}
	@Field(19) 
	public int readable() {
		return this.io.getIntField(this, 19);
	}
	@Field(19) 
	public PyFileObject readable(int readable) {
		this.io.setIntField(this, 19, readable);
		return this;
	}
	@Field(20) 
	public int writable() {
		return this.io.getIntField(this, 20);
	}
	@Field(20) 
	public PyFileObject writable(int writable) {
		this.io.setIntField(this, 20, writable);
		return this;
	}
	/// <i>native declaration : fileobject.h:25</i>
	/// <i>native declaration : fileobject.h:25</i>
	public static abstract class f_close_callback extends Callback<f_close_callback > {
		abstract public int apply(Pointer<FILE > FILEPtr1);
	};
	public PyFileObject(Pointer pointer) {
		super(pointer);
	}
}
