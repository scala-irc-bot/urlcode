// -*- scala -*-

resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.sqality.scct" % "sbt-scct" % "0.3")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.4.0")

resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
