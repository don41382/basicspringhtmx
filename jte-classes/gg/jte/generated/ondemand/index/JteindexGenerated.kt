@file:Suppress("ktlint")
package gg.jte.generated.ondemand.index
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JteindexGenerated {
companion object {
	@JvmField val JTE_NAME = "index/index.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(19,19,19,19,19,19,19,19,19)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?) {
		jteOutput.writeContent("<html lang=\"de\">\n<head>\n    <title>Shop</title>\n    <script src=\"/webjars/htmx.org/1.9.5/dist/htmx.min.js\"></script>\n    <link href=\"/daisy.full.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n</head>\n<body>\n    <div class=\"hero min-h-screen bg-base-100\">\n        <div class=\"hero-content text-center\">\n            <div class=\"max-w-md\">\n                <h1 class=\"text-6xl font-bold\">Welcome!</h1>\n                <p class=\"py-6\">Just click on the button and htmx will exchange the content.</p>\n                <button hx-get=\"/hello\"\n                        class=\"btn btn-primary\">Click me!</button>\n            </div>\n        </div>\n    </div>\n</body>\n</html>")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
}
