package scalaWebSocket

/**
 * Created by KaNguy - 06/14/2021
 * File scalaWebSocket.WebSocketDispatch.scala
 */

// Networking & web
import java.net.http.WebSocket

// New I/O
import java.nio.ByteBuffer

// Utilities
import java.util.concurrent.CompletionStage

trait WebSocketDispatch extends WebSocket.Listener {
  def onOpen(webSocket: WebSocket): Unit
  def onText(webSocket: WebSocket, data: CharSequence, last: Boolean): CompletionStage[_]
  def onPing(webSocket: WebSocket, message: ByteBuffer): CompletionStage[_]
  def onPong(webSocket: WebSocket, message: ByteBuffer): CompletionStage[_]
  def onClose(webSocket: WebSocket, statusCode: Int, reason: String): CompletionStage[_]
  def onError(webSocket: WebSocket, error: Throwable): Unit
  def onBinary(webSocket: WebSocket, data: ByteBuffer, last: Boolean): CompletionStage[_]
}