package net.mashijp.irc.bot.urlcode

import net.mtgto.irc.{Bot, Client}
import net.mtgto.irc.event._

import util.matching.Regex
import util.matching.Regex.Match
import java.net.URLDecoder
import java.net.URLEncoder

class UrlCodeBot extends Bot {
  private val decode = """decode:(.+)""".r
  private val encode = """encode:(.+)""".r

  override def onMessage(client: Client, message: Message) = {
    message.text match {
      case decode(e) => client.sendNotice(message.channel, URLDecoder.decode(e, "UTF-8"))
      case encode(e) => client.sendNotice(message.channel, URLEncoder.encode(e, "UTF-8"))
      case _ =>
    }
  }
}
