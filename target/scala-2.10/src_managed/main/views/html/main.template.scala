
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*13.71*/("""" type="text/javascript"></script>
        
    </head>
    
    <body>
    	<!-- Barra -->
    	<div>
    		<nav class="navbar navbar-default" role="navigation">
    			<div class="container-fluid">
				    <div class="navbar-header">
				    	<a class="navbar-brand" href="#">"""),_display_(Seq[Any](/*23.44*/title)),format.raw/*23.49*/("""</a>
				    </div>
				</div>
			</nav>
		</div>
        """),_display_(Seq[Any](/*28.10*/content)),format.raw/*28.17*/("""
    </body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 13:31:04 BRT 2014
                    SOURCE: /home/master/vera/lab2-parte2-si1/app/views/main.scala.html
                    HASH: b5030aa652f273cac5202137d05d4ebaede8aa1f
                    MATRIX: 778->1|902->31|990->84|1016->89|1122->160|1136->166|1201->209|1298->270|1313->276|1367->308|1437->342|1452->348|1519->393|1612->450|1627->456|1691->498|2006->777|2033->782|2128->841|2157->848
                    LINES: 26->1|29->1|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|51->23|51->23|56->28|56->28
                    -- GENERATED --
                */
            