package com.heeere.python27;
import com.heeere.python27.Python27Library.binaryfunc;
import com.heeere.python27.Python27Library.coercion;
import com.heeere.python27.Python27Library.inquiry;
import com.heeere.python27.Python27Library.ternaryfunc;
import com.heeere.python27.Python27Library.unaryfunc;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : object.h:106</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("python27") 
public class PyNumberMethods extends StructObject {
	public PyNumberMethods() {
		super();
	}
	/// C type : binaryfunc
	@Field(0) 
	public Pointer<binaryfunc > nb_add() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : binaryfunc
	@Field(0) 
	public PyNumberMethods nb_add(Pointer<binaryfunc > nb_add) {
		this.io.setPointerField(this, 0, nb_add);
		return this;
	}
	/// C type : binaryfunc
	@Field(1) 
	public Pointer<binaryfunc > nb_subtract() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : binaryfunc
	@Field(1) 
	public PyNumberMethods nb_subtract(Pointer<binaryfunc > nb_subtract) {
		this.io.setPointerField(this, 1, nb_subtract);
		return this;
	}
	/// C type : binaryfunc
	@Field(2) 
	public Pointer<binaryfunc > nb_multiply() {
		return this.io.getPointerField(this, 2);
	}
	/// C type : binaryfunc
	@Field(2) 
	public PyNumberMethods nb_multiply(Pointer<binaryfunc > nb_multiply) {
		this.io.setPointerField(this, 2, nb_multiply);
		return this;
	}
	/// C type : binaryfunc
	@Field(3) 
	public Pointer<binaryfunc > nb_divide() {
		return this.io.getPointerField(this, 3);
	}
	/// C type : binaryfunc
	@Field(3) 
	public PyNumberMethods nb_divide(Pointer<binaryfunc > nb_divide) {
		this.io.setPointerField(this, 3, nb_divide);
		return this;
	}
	/// C type : binaryfunc
	@Field(4) 
	public Pointer<binaryfunc > nb_remainder() {
		return this.io.getPointerField(this, 4);
	}
	/// C type : binaryfunc
	@Field(4) 
	public PyNumberMethods nb_remainder(Pointer<binaryfunc > nb_remainder) {
		this.io.setPointerField(this, 4, nb_remainder);
		return this;
	}
	/// C type : binaryfunc
	@Field(5) 
	public Pointer<binaryfunc > nb_divmod() {
		return this.io.getPointerField(this, 5);
	}
	/// C type : binaryfunc
	@Field(5) 
	public PyNumberMethods nb_divmod(Pointer<binaryfunc > nb_divmod) {
		this.io.setPointerField(this, 5, nb_divmod);
		return this;
	}
	/// C type : ternaryfunc
	@Field(6) 
	public Pointer<ternaryfunc > nb_power() {
		return this.io.getPointerField(this, 6);
	}
	/// C type : ternaryfunc
	@Field(6) 
	public PyNumberMethods nb_power(Pointer<ternaryfunc > nb_power) {
		this.io.setPointerField(this, 6, nb_power);
		return this;
	}
	/// C type : unaryfunc
	@Field(7) 
	public Pointer<unaryfunc > nb_negative() {
		return this.io.getPointerField(this, 7);
	}
	/// C type : unaryfunc
	@Field(7) 
	public PyNumberMethods nb_negative(Pointer<unaryfunc > nb_negative) {
		this.io.setPointerField(this, 7, nb_negative);
		return this;
	}
	/// C type : unaryfunc
	@Field(8) 
	public Pointer<unaryfunc > nb_positive() {
		return this.io.getPointerField(this, 8);
	}
	/// C type : unaryfunc
	@Field(8) 
	public PyNumberMethods nb_positive(Pointer<unaryfunc > nb_positive) {
		this.io.setPointerField(this, 8, nb_positive);
		return this;
	}
	/// C type : unaryfunc
	@Field(9) 
	public Pointer<unaryfunc > nb_absolute() {
		return this.io.getPointerField(this, 9);
	}
	/// C type : unaryfunc
	@Field(9) 
	public PyNumberMethods nb_absolute(Pointer<unaryfunc > nb_absolute) {
		this.io.setPointerField(this, 9, nb_absolute);
		return this;
	}
	/// C type : inquiry
	@Field(10) 
	public Pointer<inquiry > nb_nonzero() {
		return this.io.getPointerField(this, 10);
	}
	/// C type : inquiry
	@Field(10) 
	public PyNumberMethods nb_nonzero(Pointer<inquiry > nb_nonzero) {
		this.io.setPointerField(this, 10, nb_nonzero);
		return this;
	}
	/// C type : unaryfunc
	@Field(11) 
	public Pointer<unaryfunc > nb_invert() {
		return this.io.getPointerField(this, 11);
	}
	/// C type : unaryfunc
	@Field(11) 
	public PyNumberMethods nb_invert(Pointer<unaryfunc > nb_invert) {
		this.io.setPointerField(this, 11, nb_invert);
		return this;
	}
	/// C type : binaryfunc
	@Field(12) 
	public Pointer<binaryfunc > nb_lshift() {
		return this.io.getPointerField(this, 12);
	}
	/// C type : binaryfunc
	@Field(12) 
	public PyNumberMethods nb_lshift(Pointer<binaryfunc > nb_lshift) {
		this.io.setPointerField(this, 12, nb_lshift);
		return this;
	}
	/// C type : binaryfunc
	@Field(13) 
	public Pointer<binaryfunc > nb_rshift() {
		return this.io.getPointerField(this, 13);
	}
	/// C type : binaryfunc
	@Field(13) 
	public PyNumberMethods nb_rshift(Pointer<binaryfunc > nb_rshift) {
		this.io.setPointerField(this, 13, nb_rshift);
		return this;
	}
	/// C type : binaryfunc
	@Field(14) 
	public Pointer<binaryfunc > nb_and() {
		return this.io.getPointerField(this, 14);
	}
	/// C type : binaryfunc
	@Field(14) 
	public PyNumberMethods nb_and(Pointer<binaryfunc > nb_and) {
		this.io.setPointerField(this, 14, nb_and);
		return this;
	}
	/// C type : binaryfunc
	@Field(15) 
	public Pointer<binaryfunc > nb_xor() {
		return this.io.getPointerField(this, 15);
	}
	/// C type : binaryfunc
	@Field(15) 
	public PyNumberMethods nb_xor(Pointer<binaryfunc > nb_xor) {
		this.io.setPointerField(this, 15, nb_xor);
		return this;
	}
	/// C type : binaryfunc
	@Field(16) 
	public Pointer<binaryfunc > nb_or() {
		return this.io.getPointerField(this, 16);
	}
	/// C type : binaryfunc
	@Field(16) 
	public PyNumberMethods nb_or(Pointer<binaryfunc > nb_or) {
		this.io.setPointerField(this, 16, nb_or);
		return this;
	}
	/// C type : coercion
	@Field(17) 
	public Pointer<coercion > nb_coerce() {
		return this.io.getPointerField(this, 17);
	}
	/// C type : coercion
	@Field(17) 
	public PyNumberMethods nb_coerce(Pointer<coercion > nb_coerce) {
		this.io.setPointerField(this, 17, nb_coerce);
		return this;
	}
	/// C type : unaryfunc
	@Field(18) 
	public Pointer<unaryfunc > nb_int() {
		return this.io.getPointerField(this, 18);
	}
	/// C type : unaryfunc
	@Field(18) 
	public PyNumberMethods nb_int(Pointer<unaryfunc > nb_int) {
		this.io.setPointerField(this, 18, nb_int);
		return this;
	}
	/// C type : unaryfunc
	@Field(19) 
	public Pointer<unaryfunc > nb_long() {
		return this.io.getPointerField(this, 19);
	}
	/// C type : unaryfunc
	@Field(19) 
	public PyNumberMethods nb_long(Pointer<unaryfunc > nb_long) {
		this.io.setPointerField(this, 19, nb_long);
		return this;
	}
	/// C type : unaryfunc
	@Field(20) 
	public Pointer<unaryfunc > nb_float() {
		return this.io.getPointerField(this, 20);
	}
	/// C type : unaryfunc
	@Field(20) 
	public PyNumberMethods nb_float(Pointer<unaryfunc > nb_float) {
		this.io.setPointerField(this, 20, nb_float);
		return this;
	}
	/// C type : unaryfunc
	@Field(21) 
	public Pointer<unaryfunc > nb_oct() {
		return this.io.getPointerField(this, 21);
	}
	/// C type : unaryfunc
	@Field(21) 
	public PyNumberMethods nb_oct(Pointer<unaryfunc > nb_oct) {
		this.io.setPointerField(this, 21, nb_oct);
		return this;
	}
	/// C type : unaryfunc
	@Field(22) 
	public Pointer<unaryfunc > nb_hex() {
		return this.io.getPointerField(this, 22);
	}
	/// C type : unaryfunc
	@Field(22) 
	public PyNumberMethods nb_hex(Pointer<unaryfunc > nb_hex) {
		this.io.setPointerField(this, 22, nb_hex);
		return this;
	}
	/**
	 * Added in release 2.0<br>
	 * C type : binaryfunc
	 */
	@Field(23) 
	public Pointer<binaryfunc > nb_inplace_add() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * Added in release 2.0<br>
	 * C type : binaryfunc
	 */
	@Field(23) 
	public PyNumberMethods nb_inplace_add(Pointer<binaryfunc > nb_inplace_add) {
		this.io.setPointerField(this, 23, nb_inplace_add);
		return this;
	}
	/// C type : binaryfunc
	@Field(24) 
	public Pointer<binaryfunc > nb_inplace_subtract() {
		return this.io.getPointerField(this, 24);
	}
	/// C type : binaryfunc
	@Field(24) 
	public PyNumberMethods nb_inplace_subtract(Pointer<binaryfunc > nb_inplace_subtract) {
		this.io.setPointerField(this, 24, nb_inplace_subtract);
		return this;
	}
	/// C type : binaryfunc
	@Field(25) 
	public Pointer<binaryfunc > nb_inplace_multiply() {
		return this.io.getPointerField(this, 25);
	}
	/// C type : binaryfunc
	@Field(25) 
	public PyNumberMethods nb_inplace_multiply(Pointer<binaryfunc > nb_inplace_multiply) {
		this.io.setPointerField(this, 25, nb_inplace_multiply);
		return this;
	}
	/// C type : binaryfunc
	@Field(26) 
	public Pointer<binaryfunc > nb_inplace_divide() {
		return this.io.getPointerField(this, 26);
	}
	/// C type : binaryfunc
	@Field(26) 
	public PyNumberMethods nb_inplace_divide(Pointer<binaryfunc > nb_inplace_divide) {
		this.io.setPointerField(this, 26, nb_inplace_divide);
		return this;
	}
	/// C type : binaryfunc
	@Field(27) 
	public Pointer<binaryfunc > nb_inplace_remainder() {
		return this.io.getPointerField(this, 27);
	}
	/// C type : binaryfunc
	@Field(27) 
	public PyNumberMethods nb_inplace_remainder(Pointer<binaryfunc > nb_inplace_remainder) {
		this.io.setPointerField(this, 27, nb_inplace_remainder);
		return this;
	}
	/// C type : ternaryfunc
	@Field(28) 
	public Pointer<ternaryfunc > nb_inplace_power() {
		return this.io.getPointerField(this, 28);
	}
	/// C type : ternaryfunc
	@Field(28) 
	public PyNumberMethods nb_inplace_power(Pointer<ternaryfunc > nb_inplace_power) {
		this.io.setPointerField(this, 28, nb_inplace_power);
		return this;
	}
	/// C type : binaryfunc
	@Field(29) 
	public Pointer<binaryfunc > nb_inplace_lshift() {
		return this.io.getPointerField(this, 29);
	}
	/// C type : binaryfunc
	@Field(29) 
	public PyNumberMethods nb_inplace_lshift(Pointer<binaryfunc > nb_inplace_lshift) {
		this.io.setPointerField(this, 29, nb_inplace_lshift);
		return this;
	}
	/// C type : binaryfunc
	@Field(30) 
	public Pointer<binaryfunc > nb_inplace_rshift() {
		return this.io.getPointerField(this, 30);
	}
	/// C type : binaryfunc
	@Field(30) 
	public PyNumberMethods nb_inplace_rshift(Pointer<binaryfunc > nb_inplace_rshift) {
		this.io.setPointerField(this, 30, nb_inplace_rshift);
		return this;
	}
	/// C type : binaryfunc
	@Field(31) 
	public Pointer<binaryfunc > nb_inplace_and() {
		return this.io.getPointerField(this, 31);
	}
	/// C type : binaryfunc
	@Field(31) 
	public PyNumberMethods nb_inplace_and(Pointer<binaryfunc > nb_inplace_and) {
		this.io.setPointerField(this, 31, nb_inplace_and);
		return this;
	}
	/// C type : binaryfunc
	@Field(32) 
	public Pointer<binaryfunc > nb_inplace_xor() {
		return this.io.getPointerField(this, 32);
	}
	/// C type : binaryfunc
	@Field(32) 
	public PyNumberMethods nb_inplace_xor(Pointer<binaryfunc > nb_inplace_xor) {
		this.io.setPointerField(this, 32, nb_inplace_xor);
		return this;
	}
	/// C type : binaryfunc
	@Field(33) 
	public Pointer<binaryfunc > nb_inplace_or() {
		return this.io.getPointerField(this, 33);
	}
	/// C type : binaryfunc
	@Field(33) 
	public PyNumberMethods nb_inplace_or(Pointer<binaryfunc > nb_inplace_or) {
		this.io.setPointerField(this, 33, nb_inplace_or);
		return this;
	}
	/**
	 * The following require the Py_TPFLAGS_HAVE_CLASS flag<br>
	 * C type : binaryfunc
	 */
	@Field(34) 
	public Pointer<binaryfunc > nb_floor_divide() {
		return this.io.getPointerField(this, 34);
	}
	/**
	 * The following require the Py_TPFLAGS_HAVE_CLASS flag<br>
	 * C type : binaryfunc
	 */
	@Field(34) 
	public PyNumberMethods nb_floor_divide(Pointer<binaryfunc > nb_floor_divide) {
		this.io.setPointerField(this, 34, nb_floor_divide);
		return this;
	}
	/// C type : binaryfunc
	@Field(35) 
	public Pointer<binaryfunc > nb_true_divide() {
		return this.io.getPointerField(this, 35);
	}
	/// C type : binaryfunc
	@Field(35) 
	public PyNumberMethods nb_true_divide(Pointer<binaryfunc > nb_true_divide) {
		this.io.setPointerField(this, 35, nb_true_divide);
		return this;
	}
	/// C type : binaryfunc
	@Field(36) 
	public Pointer<binaryfunc > nb_inplace_floor_divide() {
		return this.io.getPointerField(this, 36);
	}
	/// C type : binaryfunc
	@Field(36) 
	public PyNumberMethods nb_inplace_floor_divide(Pointer<binaryfunc > nb_inplace_floor_divide) {
		this.io.setPointerField(this, 36, nb_inplace_floor_divide);
		return this;
	}
	/// C type : binaryfunc
	@Field(37) 
	public Pointer<binaryfunc > nb_inplace_true_divide() {
		return this.io.getPointerField(this, 37);
	}
	/// C type : binaryfunc
	@Field(37) 
	public PyNumberMethods nb_inplace_true_divide(Pointer<binaryfunc > nb_inplace_true_divide) {
		this.io.setPointerField(this, 37, nb_inplace_true_divide);
		return this;
	}
	/**
	 * Added in release 2.5<br>
	 * C type : unaryfunc
	 */
	@Field(38) 
	public Pointer<unaryfunc > nb_index() {
		return this.io.getPointerField(this, 38);
	}
	/**
	 * Added in release 2.5<br>
	 * C type : unaryfunc
	 */
	@Field(38) 
	public PyNumberMethods nb_index(Pointer<unaryfunc > nb_index) {
		this.io.setPointerField(this, 38, nb_index);
		return this;
	}
	public PyNumberMethods(Pointer pointer) {
		super(pointer);
	}
}
