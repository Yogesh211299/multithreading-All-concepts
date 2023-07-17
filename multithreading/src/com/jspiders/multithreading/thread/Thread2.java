package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Resource;

public class Thread2 extends Thread {
     Resource resource;

	public Thread2(Resource resource) {
		super();
		this.resource = resource;
	}
     
     @Override
    public void run() {
        synchronized (resource.res2) {
        	System.out.println(getName()+" applied lock on "+resource.res2);
        	
        	synchronized (resource.res1) {
        		System.out.println(getName()+"applied lock on "+resource.res1);
			}
        	System.out.println(getName()+" released lock on  "+resource.res1);
		}
        System.out.println(getName()+"applied lock on "+resource.res2);
     }
}
