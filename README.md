# eureka-zuul-RESTful
# eureka-zuul-spring
Eureka spring cloud with ZUUL netflix API (gateway and load balancer).

We can run many instancess of any webservices each one would run on different port and all of them whould register itself in the discovery server "Eureka" which is run on port 8010. Each of our instances has an id and a name on eureka dash board "http://www.localhost:8010" which whould be used by ZUUL to route traffic between instances.
Using  zuul gateway api we can route and balance traffic between client app and our web services. ZUUL would run on port 8011 and all the traffic should go throw zuul. If zuul run on localhost we can send http request "http://localhost:8011/service-name/RESTFul-Controller-url/Get-mapping-method" -> http://localhost:8011/users-ws/users/status/check.
