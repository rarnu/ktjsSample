class SampleClass(val name: String) {
    fun use() { println(name) }
}

@JsName("sayHello")
fun sayHello(who: String) = "hello, $who"
