smb
========
smb is an irc bot to exchange SMB Path format between Mac / Windows for [scala-irc-bot](https://github.com/scala-irc-bot/scala-irc-bot).

# Installation
1. git clone
2. sbt package
3. copy `smb/target/scala-2.9.2/smb_2.9.2-0.1.0-SNAPSHOT.jar` to `scala-irc-bot/bots`.
4. modify `scala-irc-bot/config/Config.scala` like:

```scala
val bots = Array[(String, Option[BotConfig])](
  ("net.mtgto.irc.bot.smb.SmbBot", None)
)
```
