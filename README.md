= Showcase of bloop compilation with scalameta + cats.tagless

Steps to reproduce:

1. Install and start bloop 1.2.5 
2. `sbt compile` - works successfully 
3. `sbt bloopInstall && bloop compile tagless_failure_showcase` - fails because macro wasn't expanded