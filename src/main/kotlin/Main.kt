import kotlinx.html.button
import kotlinx.html.dom.create
import kotlinx.html.h1
import kotlinx.html.js.div
import kotlinx.html.js.onClickFunction
import kotlin.browser.document

@JsName("main")
fun main(args: Array<String>) {
    val root = document.getElementById("root")
    val div = document.create.div {
        h1 { text("Hello Ktjs") }
        button {
            text("Click Me!")
            onClickFunction = { println("Clicked!!!") }
        }
    }
    root?.append(div)
    val btn = document.getElementById("btn").asDynamic()
    btn.onclick = { println("button clicked!") }
    val ret = js("jsFunc();")
    println(ret)
}