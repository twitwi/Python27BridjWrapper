package com.heeere.python27;
import com.heeere.python27.Python27Library.PyMemberDef;
import com.heeere.python27.Python27Library.Py_ssize_t;
import com.heeere.python27.Python27Library.allocfunc;
import com.heeere.python27.Python27Library.cmpfunc;
import com.heeere.python27.Python27Library.descrgetfunc;
import com.heeere.python27.Python27Library.descrsetfunc;
import com.heeere.python27.Python27Library.destructor;
import com.heeere.python27.Python27Library.freefunc;
import com.heeere.python27.Python27Library.getattrfunc;
import com.heeere.python27.Python27Library.getattrofunc;
import com.heeere.python27.Python27Library.getiterfunc;
import com.heeere.python27.Python27Library.hashfunc;
import com.heeere.python27.Python27Library.initproc;
import com.heeere.python27.Python27Library.inquiry;
import com.heeere.python27.Python27Library.iternextfunc;
import com.heeere.python27.Python27Library.newfunc;
import com.heeere.python27.Python27Library.printfunc;
import com.heeere.python27.Python27Library.reprfunc;
import com.heeere.python27.Python27Library.richcmpfunc;
import com.heeere.python27.Python27Library.setattrfunc;
import com.heeere.python27.Python27Library.setattrofunc;
import com.heeere.python27.Python27Library.ternaryfunc;
import com.heeere.python27.Python27Library.traverseproc;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : object.h:210</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyTypeObject extends StructObject {
	public PyTypeObject() {
		super();
	}
	/// C type : Py_ssize_t
	@Field(0) 
	public Pointer<Py_ssize_t > ob_refcnt() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : Py_ssize_t
	@Field(0) 
	public PyTypeObject ob_refcnt(Pointer<Py_ssize_t > ob_refcnt) {
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
	public PyTypeObject ob_type(Pointer<PyTypeObject > ob_type) {
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
	public PyTypeObject ob_size(Pointer<Py_ssize_t > ob_size) {
		this.io.setPointerField(this, 2, ob_size);
		return this;
	}
	/**
	 * For printing, in format "<module>.<name>"<br>
	 * C type : const char*
	 */
	@Field(3) 
	public Pointer<Byte > tp_name() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * For printing, in format "<module>.<name>"<br>
	 * C type : const char*
	 */
	@Field(3) 
	public PyTypeObject tp_name(Pointer<Byte > tp_name) {
		this.io.setPointerField(this, 3, tp_name);
		return this;
	}
	/**
	 * For allocation<br>
	 * C type : Py_ssize_t
	 */
	@Field(4) 
	public Pointer<Py_ssize_t > tp_basicsize() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * For allocation<br>
	 * C type : Py_ssize_t
	 */
	@Field(4) 
	public PyTypeObject tp_basicsize(Pointer<Py_ssize_t > tp_basicsize) {
		this.io.setPointerField(this, 4, tp_basicsize);
		return this;
	}
	/**
	 * For allocation<br>
	 * C type : Py_ssize_t
	 */
	@Field(5) 
	public Pointer<Py_ssize_t > tp_itemsize() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * For allocation<br>
	 * C type : Py_ssize_t
	 */
	@Field(5) 
	public PyTypeObject tp_itemsize(Pointer<Py_ssize_t > tp_itemsize) {
		this.io.setPointerField(this, 5, tp_itemsize);
		return this;
	}
	/// C type : destructor
	@Field(6) 
	public Pointer<destructor > tp_dealloc() {
		return this.io.getPointerField(this, 6);
	}
	/// C type : destructor
	@Field(6) 
	public PyTypeObject tp_dealloc(Pointer<destructor > tp_dealloc) {
		this.io.setPointerField(this, 6, tp_dealloc);
		return this;
	}
	/// C type : printfunc
	@Field(7) 
	public Pointer<printfunc > tp_print() {
		return this.io.getPointerField(this, 7);
	}
	/// C type : printfunc
	@Field(7) 
	public PyTypeObject tp_print(Pointer<printfunc > tp_print) {
		this.io.setPointerField(this, 7, tp_print);
		return this;
	}
	/// C type : getattrfunc
	@Field(8) 
	public Pointer<getattrfunc > tp_getattr() {
		return this.io.getPointerField(this, 8);
	}
	/// C type : getattrfunc
	@Field(8) 
	public PyTypeObject tp_getattr(Pointer<getattrfunc > tp_getattr) {
		this.io.setPointerField(this, 8, tp_getattr);
		return this;
	}
	/// C type : setattrfunc
	@Field(9) 
	public Pointer<setattrfunc > tp_setattr() {
		return this.io.getPointerField(this, 9);
	}
	/// C type : setattrfunc
	@Field(9) 
	public PyTypeObject tp_setattr(Pointer<setattrfunc > tp_setattr) {
		this.io.setPointerField(this, 9, tp_setattr);
		return this;
	}
	/// C type : cmpfunc
	@Field(10) 
	public Pointer<cmpfunc > tp_compare() {
		return this.io.getPointerField(this, 10);
	}
	/// C type : cmpfunc
	@Field(10) 
	public PyTypeObject tp_compare(Pointer<cmpfunc > tp_compare) {
		this.io.setPointerField(this, 10, tp_compare);
		return this;
	}
	/// C type : reprfunc
	@Field(11) 
	public Pointer<reprfunc > tp_repr() {
		return this.io.getPointerField(this, 11);
	}
	/// C type : reprfunc
	@Field(11) 
	public PyTypeObject tp_repr(Pointer<reprfunc > tp_repr) {
		this.io.setPointerField(this, 11, tp_repr);
		return this;
	}
	/// C type : PyNumberMethods*
	@Field(12) 
	public Pointer<PyNumberMethods > tp_as_number() {
		return this.io.getPointerField(this, 12);
	}
	/// C type : PyNumberMethods*
	@Field(12) 
	public PyTypeObject tp_as_number(Pointer<PyNumberMethods > tp_as_number) {
		this.io.setPointerField(this, 12, tp_as_number);
		return this;
	}
	/// C type : PySequenceMethods*
	@Field(13) 
	public Pointer<PySequenceMethods > tp_as_sequence() {
		return this.io.getPointerField(this, 13);
	}
	/// C type : PySequenceMethods*
	@Field(13) 
	public PyTypeObject tp_as_sequence(Pointer<PySequenceMethods > tp_as_sequence) {
		this.io.setPointerField(this, 13, tp_as_sequence);
		return this;
	}
	/// C type : PyMappingMethods*
	@Field(14) 
	public Pointer<PyMappingMethods > tp_as_mapping() {
		return this.io.getPointerField(this, 14);
	}
	/// C type : PyMappingMethods*
	@Field(14) 
	public PyTypeObject tp_as_mapping(Pointer<PyMappingMethods > tp_as_mapping) {
		this.io.setPointerField(this, 14, tp_as_mapping);
		return this;
	}
	/// C type : hashfunc
	@Field(15) 
	public Pointer<hashfunc > tp_hash() {
		return this.io.getPointerField(this, 15);
	}
	/// C type : hashfunc
	@Field(15) 
	public PyTypeObject tp_hash(Pointer<hashfunc > tp_hash) {
		this.io.setPointerField(this, 15, tp_hash);
		return this;
	}
	/// C type : ternaryfunc
	@Field(16) 
	public Pointer<ternaryfunc > tp_call() {
		return this.io.getPointerField(this, 16);
	}
	/// C type : ternaryfunc
	@Field(16) 
	public PyTypeObject tp_call(Pointer<ternaryfunc > tp_call) {
		this.io.setPointerField(this, 16, tp_call);
		return this;
	}
	/// C type : reprfunc
	@Field(17) 
	public Pointer<reprfunc > tp_str() {
		return this.io.getPointerField(this, 17);
	}
	/// C type : reprfunc
	@Field(17) 
	public PyTypeObject tp_str(Pointer<reprfunc > tp_str) {
		this.io.setPointerField(this, 17, tp_str);
		return this;
	}
	/// C type : getattrofunc
	@Field(18) 
	public Pointer<getattrofunc > tp_getattro() {
		return this.io.getPointerField(this, 18);
	}
	/// C type : getattrofunc
	@Field(18) 
	public PyTypeObject tp_getattro(Pointer<getattrofunc > tp_getattro) {
		this.io.setPointerField(this, 18, tp_getattro);
		return this;
	}
	/// C type : setattrofunc
	@Field(19) 
	public Pointer<setattrofunc > tp_setattro() {
		return this.io.getPointerField(this, 19);
	}
	/// C type : setattrofunc
	@Field(19) 
	public PyTypeObject tp_setattro(Pointer<setattrofunc > tp_setattro) {
		this.io.setPointerField(this, 19, tp_setattro);
		return this;
	}
	/**
	 * Functions to access object as input/output buffer<br>
	 * C type : PyBufferProcs*
	 */
	@Field(20) 
	public Pointer<PyBufferProcs > tp_as_buffer() {
		return this.io.getPointerField(this, 20);
	}
	/**
	 * Functions to access object as input/output buffer<br>
	 * C type : PyBufferProcs*
	 */
	@Field(20) 
	public PyTypeObject tp_as_buffer(Pointer<PyBufferProcs > tp_as_buffer) {
		this.io.setPointerField(this, 20, tp_as_buffer);
		return this;
	}
	/// Flags to define presence of optional/expanded features
	@CLong 
	@Field(21) 
	public long tp_flags() {
		return this.io.getCLongField(this, 21);
	}
	/// Flags to define presence of optional/expanded features
	@CLong 
	@Field(21) 
	public PyTypeObject tp_flags(long tp_flags) {
		this.io.setCLongField(this, 21, tp_flags);
		return this;
	}
	/**
	 * Documentation string<br>
	 * C type : const char*
	 */
	@Field(22) 
	public Pointer<Byte > tp_doc() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * Documentation string<br>
	 * C type : const char*
	 */
	@Field(22) 
	public PyTypeObject tp_doc(Pointer<Byte > tp_doc) {
		this.io.setPointerField(this, 22, tp_doc);
		return this;
	}
	/**
	 * call function for all accessible objects<br>
	 * C type : traverseproc
	 */
	@Field(23) 
	public Pointer<traverseproc > tp_traverse() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * call function for all accessible objects<br>
	 * C type : traverseproc
	 */
	@Field(23) 
	public PyTypeObject tp_traverse(Pointer<traverseproc > tp_traverse) {
		this.io.setPointerField(this, 23, tp_traverse);
		return this;
	}
	/**
	 * delete references to contained objects<br>
	 * C type : inquiry
	 */
	@Field(24) 
	public Pointer<inquiry > tp_clear() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * delete references to contained objects<br>
	 * C type : inquiry
	 */
	@Field(24) 
	public PyTypeObject tp_clear(Pointer<inquiry > tp_clear) {
		this.io.setPointerField(this, 24, tp_clear);
		return this;
	}
	/**
	 * rich comparisons<br>
	 * C type : richcmpfunc
	 */
	@Field(25) 
	public Pointer<richcmpfunc > tp_richcompare() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * rich comparisons<br>
	 * C type : richcmpfunc
	 */
	@Field(25) 
	public PyTypeObject tp_richcompare(Pointer<richcmpfunc > tp_richcompare) {
		this.io.setPointerField(this, 25, tp_richcompare);
		return this;
	}
	/**
	 * weak reference enabler<br>
	 * C type : Py_ssize_t
	 */
	@Field(26) 
	public Pointer<Py_ssize_t > tp_weaklistoffset() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * weak reference enabler<br>
	 * C type : Py_ssize_t
	 */
	@Field(26) 
	public PyTypeObject tp_weaklistoffset(Pointer<Py_ssize_t > tp_weaklistoffset) {
		this.io.setPointerField(this, 26, tp_weaklistoffset);
		return this;
	}
	/**
	 * Iterators<br>
	 * C type : getiterfunc
	 */
	@Field(27) 
	public Pointer<getiterfunc > tp_iter() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * Iterators<br>
	 * C type : getiterfunc
	 */
	@Field(27) 
	public PyTypeObject tp_iter(Pointer<getiterfunc > tp_iter) {
		this.io.setPointerField(this, 27, tp_iter);
		return this;
	}
	/// C type : iternextfunc
	@Field(28) 
	public Pointer<iternextfunc > tp_iternext() {
		return this.io.getPointerField(this, 28);
	}
	/// C type : iternextfunc
	@Field(28) 
	public PyTypeObject tp_iternext(Pointer<iternextfunc > tp_iternext) {
		this.io.setPointerField(this, 28, tp_iternext);
		return this;
	}
	/**
	 * Attribute descriptor and subclassing stuff<br>
	 * C type : PyMethodDef*
	 */
	@Field(29) 
	public Pointer<PyMethodDef > tp_methods() {
		return this.io.getPointerField(this, 29);
	}
	/**
	 * Attribute descriptor and subclassing stuff<br>
	 * C type : PyMethodDef*
	 */
	@Field(29) 
	public PyTypeObject tp_methods(Pointer<PyMethodDef > tp_methods) {
		this.io.setPointerField(this, 29, tp_methods);
		return this;
	}
	/// C type : PyMemberDef*
	@Field(30) 
	public Pointer<PyMemberDef > tp_members() {
		return this.io.getPointerField(this, 30);
	}
	/// C type : PyMemberDef*
	@Field(30) 
	public PyTypeObject tp_members(Pointer<PyMemberDef > tp_members) {
		this.io.setPointerField(this, 30, tp_members);
		return this;
	}
	/// C type : PyGetSetDef*
	@Field(31) 
	public Pointer<PyGetSetDef > tp_getset() {
		return this.io.getPointerField(this, 31);
	}
	/// C type : PyGetSetDef*
	@Field(31) 
	public PyTypeObject tp_getset(Pointer<PyGetSetDef > tp_getset) {
		this.io.setPointerField(this, 31, tp_getset);
		return this;
	}
	/// C type : _typeobject*
	@Field(32) 
	public Pointer<PyTypeObject > tp_base() {
		return this.io.getPointerField(this, 32);
	}
	/// C type : _typeobject*
	@Field(32) 
	public PyTypeObject tp_base(Pointer<PyTypeObject > tp_base) {
		this.io.setPointerField(this, 32, tp_base);
		return this;
	}
	/// C type : PyObject*
	@Field(33) 
	public Pointer<PyObject > tp_dict() {
		return this.io.getPointerField(this, 33);
	}
	/// C type : PyObject*
	@Field(33) 
	public PyTypeObject tp_dict(Pointer<PyObject > tp_dict) {
		this.io.setPointerField(this, 33, tp_dict);
		return this;
	}
	/// C type : descrgetfunc
	@Field(34) 
	public Pointer<descrgetfunc > tp_descr_get() {
		return this.io.getPointerField(this, 34);
	}
	/// C type : descrgetfunc
	@Field(34) 
	public PyTypeObject tp_descr_get(Pointer<descrgetfunc > tp_descr_get) {
		this.io.setPointerField(this, 34, tp_descr_get);
		return this;
	}
	/// C type : descrsetfunc
	@Field(35) 
	public Pointer<descrsetfunc > tp_descr_set() {
		return this.io.getPointerField(this, 35);
	}
	/// C type : descrsetfunc
	@Field(35) 
	public PyTypeObject tp_descr_set(Pointer<descrsetfunc > tp_descr_set) {
		this.io.setPointerField(this, 35, tp_descr_set);
		return this;
	}
	/// C type : Py_ssize_t
	@Field(36) 
	public Pointer<Py_ssize_t > tp_dictoffset() {
		return this.io.getPointerField(this, 36);
	}
	/// C type : Py_ssize_t
	@Field(36) 
	public PyTypeObject tp_dictoffset(Pointer<Py_ssize_t > tp_dictoffset) {
		this.io.setPointerField(this, 36, tp_dictoffset);
		return this;
	}
	/// C type : initproc
	@Field(37) 
	public Pointer<initproc > tp_init() {
		return this.io.getPointerField(this, 37);
	}
	/// C type : initproc
	@Field(37) 
	public PyTypeObject tp_init(Pointer<initproc > tp_init) {
		this.io.setPointerField(this, 37, tp_init);
		return this;
	}
	/// C type : allocfunc
	@Field(38) 
	public Pointer<allocfunc > tp_alloc() {
		return this.io.getPointerField(this, 38);
	}
	/// C type : allocfunc
	@Field(38) 
	public PyTypeObject tp_alloc(Pointer<allocfunc > tp_alloc) {
		this.io.setPointerField(this, 38, tp_alloc);
		return this;
	}
	/// C type : newfunc
	@Field(39) 
	public Pointer<newfunc > tp_new() {
		return this.io.getPointerField(this, 39);
	}
	/// C type : newfunc
	@Field(39) 
	public PyTypeObject tp_new(Pointer<newfunc > tp_new) {
		this.io.setPointerField(this, 39, tp_new);
		return this;
	}
	/**
	 * Low-level free-memory routine<br>
	 * C type : freefunc
	 */
	@Field(40) 
	public Pointer<freefunc > tp_free() {
		return this.io.getPointerField(this, 40);
	}
	/**
	 * Low-level free-memory routine<br>
	 * C type : freefunc
	 */
	@Field(40) 
	public PyTypeObject tp_free(Pointer<freefunc > tp_free) {
		this.io.setPointerField(this, 40, tp_free);
		return this;
	}
	/**
	 * For PyObject_IS_GC<br>
	 * C type : inquiry
	 */
	@Field(41) 
	public Pointer<inquiry > tp_is_gc() {
		return this.io.getPointerField(this, 41);
	}
	/**
	 * For PyObject_IS_GC<br>
	 * C type : inquiry
	 */
	@Field(41) 
	public PyTypeObject tp_is_gc(Pointer<inquiry > tp_is_gc) {
		this.io.setPointerField(this, 41, tp_is_gc);
		return this;
	}
	/// C type : PyObject*
	@Field(42) 
	public Pointer<PyObject > tp_bases() {
		return this.io.getPointerField(this, 42);
	}
	/// C type : PyObject*
	@Field(42) 
	public PyTypeObject tp_bases(Pointer<PyObject > tp_bases) {
		this.io.setPointerField(this, 42, tp_bases);
		return this;
	}
	/**
	 * method resolution order<br>
	 * C type : PyObject*
	 */
	@Field(43) 
	public Pointer<PyObject > tp_mro() {
		return this.io.getPointerField(this, 43);
	}
	/**
	 * method resolution order<br>
	 * C type : PyObject*
	 */
	@Field(43) 
	public PyTypeObject tp_mro(Pointer<PyObject > tp_mro) {
		this.io.setPointerField(this, 43, tp_mro);
		return this;
	}
	/// C type : PyObject*
	@Field(44) 
	public Pointer<PyObject > tp_cache() {
		return this.io.getPointerField(this, 44);
	}
	/// C type : PyObject*
	@Field(44) 
	public PyTypeObject tp_cache(Pointer<PyObject > tp_cache) {
		this.io.setPointerField(this, 44, tp_cache);
		return this;
	}
	/// C type : PyObject*
	@Field(45) 
	public Pointer<PyObject > tp_subclasses() {
		return this.io.getPointerField(this, 45);
	}
	/// C type : PyObject*
	@Field(45) 
	public PyTypeObject tp_subclasses(Pointer<PyObject > tp_subclasses) {
		this.io.setPointerField(this, 45, tp_subclasses);
		return this;
	}
	/// C type : PyObject*
	@Field(46) 
	public Pointer<PyObject > tp_weaklist() {
		return this.io.getPointerField(this, 46);
	}
	/// C type : PyObject*
	@Field(46) 
	public PyTypeObject tp_weaklist(Pointer<PyObject > tp_weaklist) {
		this.io.setPointerField(this, 46, tp_weaklist);
		return this;
	}
	/// C type : destructor
	@Field(47) 
	public Pointer<destructor > tp_del() {
		return this.io.getPointerField(this, 47);
	}
	/// C type : destructor
	@Field(47) 
	public PyTypeObject tp_del(Pointer<destructor > tp_del) {
		this.io.setPointerField(this, 47, tp_del);
		return this;
	}
	/// Type attribute cache version tag. Added in version 2.6
	@Field(48) 
	public int tp_version_tag() {
		return this.io.getIntField(this, 48);
	}
	/// Type attribute cache version tag. Added in version 2.6
	@Field(48) 
	public PyTypeObject tp_version_tag(int tp_version_tag) {
		this.io.setIntField(this, 48, tp_version_tag);
		return this;
	}
	public PyTypeObject(Pointer pointer) {
		super(pointer);
	}
}