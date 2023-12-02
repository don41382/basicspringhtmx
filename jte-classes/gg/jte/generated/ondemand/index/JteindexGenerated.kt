@file:Suppress("ktlint")
package gg.jte.generated.ondemand.index
import gg.jte.Content
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JteindexGenerated {
companion object {
	@JvmField val JTE_NAME = "index/index.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,2,2,2,2,2,17,17,17,17,32)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, content:Content) {
		jteOutput.writeContent("\n<html lang=\"de\">\n<head>\n    <title>Shop</title>\n    <script src=\"/webjars/htmx.org/1.9.5/dist/htmx.min.js\"></script>\n    <link href=\"/daisy.full.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n</head>\n<body>\n    <div class=\"navbar bg-primary text-base-100\">\n        <a class=\"btn btn-ghost text-xl\" href=\"/\">Simple HTMX</a>\n        <a class=\"btn btn-ghost text-xl\" href=\"/counter\">Stateful Counter</a>\n    </div>\n    <div class=\"hero min-h-[85%]\">\n        ")
		jteOutput.setContext("div", null)
		jteOutput.writeUserContent(content)
		jteOutput.writeContent("\n    </div>\n    <script>\n        document.body.addEventListener('htmx:configRequest', function(evt) {\n            <!-- This is a need way to send query parameter to the backend via http header -->\n            let queryParams = new URLSearchParams(window.location.search);\n            queryParams.forEach((value, key) => {\n                evt.detail.headers['query_' + key] = value;\n            })\n        });\n        document.body.addEventListener('htmx:responseError', function(req, elt, target) {\n            console.error(\"Request returned with an error\", req.detail.error)\n        })\n    </script>\n</body>\n</html>")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val content = params["content"] as Content
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
}
