@file:Suppress("ktlint")
package gg.jte.generated.ondemand.index
import gg.jte.Content
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JteindexGenerated {
companion object {
	@JvmField val JTE_NAME = "index/index.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,2,2,2,2,2,12,12,12,12,14)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, content:Content) {
		jteOutput.writeContent("\n<html lang=\"de\">\n<head>\n    <title>Shop</title>\n    <script src=\"/webjars/htmx.org/1.9.5/dist/htmx.min.js\"></script>\n    <link href=\"/daisy.full.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n</head>\n<body>\n    ")
		jteOutput.setContext("body", null)
		jteOutput.writeUserContent(content)
		jteOutput.writeContent("\n</body>\n</html>")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val content = params["content"] as Content
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
}
