package com.aol.micro.server.reactive;

import com.aol.simple.react.stream.lazy.LazyReact;

public class Reactors {
	private static volatile int IOThreadPoolSize=100;
	private static volatile int CPUBoundThreadPoolSize=Runtime.getRuntime().availableProcessors();
	private static void setIOThreadPoolSize(int size){
		IOThreadPoolSize=size;
	}
	private static void setCPUBoundThreadPoolSize(int size){
		CPUBoundThreadPoolSize=size;
	}
	public final static LazyReact ioReact = new LazyReact(IOThreadPoolSize,IOThreadPoolSize);
	public final static LazyReact cpuReact = new LazyReact(CPUBoundThreadPoolSize,CPUBoundThreadPoolSize);
}
