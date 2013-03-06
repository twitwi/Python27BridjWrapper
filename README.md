Python27BridjWrapper
====================

Small maven project to build and package a java wrapper for python 2.7 (using jnaerator and bridj).

## Notes

For convenience, the generated sources are commited in this repository.
It is not strictly necessary but it might help in finding problems in automatic wrapper generation.

## How to build

    mvn com.nativelibs4java:maven-jnaerator-plugin:generate
    mvn install
