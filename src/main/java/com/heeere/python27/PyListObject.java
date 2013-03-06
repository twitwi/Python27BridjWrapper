package com.heeere.python27;
import com.heeere.python27.Python27Library.Py_ssize_t;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : listobject.h:19</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyListObject extends StructObject {
	public PyListObject() {
		super();
	}
	/// C type : Py_ssize_t
	@Field(0) 
	public Pointer<Py_ssize_t > ob_refcnt() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : Py_ssize_t
	@Field(0) 
	public PyListObject ob_refcnt(Pointer<Py_ssize_t > ob_refcnt) {
		this.io.setPointerField(this, 0, ob_refcnt);
		return this;
	}
	/// C type : _typeobject*
	@Field(1) 
	public Pointer<PyTypeObject > ob_type() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : _typeobject*
	@Field(1) 
	public PyListObject ob_type(Pointer<PyTypeObject > ob_type) {
		this.io.setPointerField(this, 1, ob_type);
		return this;
	}
	/// C type : Py_ssize_t
	@Field(2) 
	public Pointer<Py_ssize_t > ob_size() {
		return this.io.getPointerField(this, 2);
	}
	/// C type : Py_ssize_t
	@Field(2) 
	public PyListObject ob_size(Pointer<Py_ssize_t > ob_size) {
		this.io.setPointerField(this, 2, ob_size);
		return this;
	}
	/**
	 * Vector of pointers to list elements.  list[0] is ob_item[0], etc.<br>
	 * C type : PyObject**
	 */
	@Field(3) 
	public Pointer<Pointer<PyObject > > ob_item() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * Vector of pointers to list elements.  list[0] is ob_item[0], etc.<br>
	 * C type : PyObject**
	 */
	@Field(3) 
	public PyListObject ob_item(Pointer<Pointer<PyObject > > ob_item) {
		this.io.setPointerField(this, 3, ob_item);
		return this;
	}
	/**
	 * ob_item contains space for 'allocated' elements.  The number<br>
	 * currently in use is ob_size.<br>
	 * Invariants:<br>
	 *     0 <= ob_size <= allocated<br>
	 *     len(list) == ob_size<br>
	 *     ob_item == NULL implies ob_size == allocated == 0<br>
	 * list.sort() temporarily sets allocated to -1 to detect mutations.<br>
	 * * Items must normally not be NULL, except during construction when<br>
	 * the list is not yet visible outside the function that builds it.<br>
	 * C type : Py_ssize_t
	 */
	@Field(4) 
	public Pointer<Py_ssize_t > allocated() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * ob_item contains space for 'allocated' elements.  The number<br>
	 * currently in use is ob_size.<br>
	 * Invariants:<br>
	 *     0 <= ob_size <= allocated<br>
	 *     len(list) == ob_size<br>
	 *     ob_item == NULL implies ob_size == allocated == 0<br>
	 * list.sort() temporarily sets allocated to -1 to detect mutations.<br>
	 * * Items must normally not be NULL, except during construction when<br>
	 * the list is not yet visible outside the function that builds it.<br>
	 * C type : Py_ssize_t
	 */
	@Field(4) 
	public PyListObject allocated(Pointer<Py_ssize_t > allocated) {
		this.io.setPointerField(this, 4, allocated);
		return this;
	}
	public PyListObject(Pointer pointer) {
		super(pointer);
	}
}
