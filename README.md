demystify-CDI
===================
Code demonstrating approach to decouple and inject your components with CDI (Context and Dependency Injection) in your Java SE and Java EE applications.
> **Note:**
> - Project has a standard maven structure. See pom.xml for details.
> - Tests are written using Spock .
> - Code in CDI Application demonstrates how to bootstrap the BeanManager/ CDI Container(programmatic in JAVA SE). It is verbose and can be ignored as Java EE Container will provide these services. 

Code Samples illustrate how to use the following for CDI :
 - @Produces
 - @Disposes
 - @Interceptor
 - @InterceptorBindings
 - @Decorator
 - @Inject
 - @Qualifiers
 - Events (Firing an Event / @Observes)