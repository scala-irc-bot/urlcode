URLCode
========
URLCode is an irc bot of [scala-irc-bot](https://github.com/scala-irc-bot/scala-irc-bot) to urldecode and urlencode.

# Installation
1. git clone
2. sbt package
3. copy `urlcode/target/scala-2.9.2/urlcode_2.9.2-0.1.0-SNAPSHOT.jar` to `scala-irc-bot/bots`.
4. modify `scala-irc-bot/config/Config.scala` like:

```scala
val bots = Array[(String, Option[BotConfig])](
  ("net.mashijp.irc.bot.urlcode.UrlCodeBot", None)
)
```
