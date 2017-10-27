package com.aa.papp.beans;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor{

	/**
	 * To write the Advice class our class should implements MethodInterceptor
	 * and override the method Invoke which takes methodInvocatin as parameter
	 * 
	 * MethodInvocation will have the details of actual method name in target and
	 * it's parameters. But why we need these param and method name having in method Invocation?
	 * 
	 * Around Adivse is having some control points like
	 * 1. Parameters can be changed at run time.
	 * 2. We can change the return value 
	 * 3. Control over executing the target class method.
	 *
	 * Important:
	 * 
	 * We can implement  MethodReplaces which is one of way using ArounAdvice.
	 * For this we should not call the methodInvocatin.proceed() in the Advice class Invoke()
	 * 
	 * We cannot provide chain of Advices in one class. Rather we should write them
	 * individually in separate AdviceClasses
	 */
	
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("entered into cache invoke");
		String methodName = methodInvocation.getMethod().getName();
		Object[] arg =  methodInvocation.getArguments();
		System.out.println("Entering add " + methodName);
		System.out.print("Variables are "); 
		for(int i =0; i<arg.length;i++) {
			if(i==0) {
				System.out.print(arg[i]);
				continue;
			}
			System.out.println("," + arg[i]);
			
		}	
		arg[0]  = (Integer)arg[0]+1; /** Modified the arg value of target class method **/
		arg[1] = (Integer)arg[1]+1; /** Modified the arg value of target class method **/
		System.out.println(arg[0]);
		System.out.println(arg[1]);
		System.out.println("in add()");
		Object ob = methodInvocation.proceed();
		//System.out.println("OB value before increment " +ob);
		ob = (Integer)ob+1;
		//System.out.println("OB value after increment " +ob);
		Object ob1 = ob;
		System.out.println("Exiting with " + methodName);
		return ob1; /** Modified the return value of target class method **/
	}

}
