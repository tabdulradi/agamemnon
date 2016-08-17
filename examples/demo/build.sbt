scalaVersion := "2.11.8"

resolvers += Resolver.bintrayRepo("tabdulradi", "maven")

libraryDependencies += "io.github.cassandra-scala" %% "troy" % "0.0.2"

unmanagedClasspath in Compile ++= (unmanagedResources in Compile).value
