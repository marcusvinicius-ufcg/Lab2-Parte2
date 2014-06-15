
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
object cadastro extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.Meta],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(meta: Form[models.Meta]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main("Cadastrar Metas")/*5.25*/{_display_(Seq[Any](format.raw/*5.26*/("""
<div class="container-fluid">
	<div class="row">
		<!--  Barra Lateral -->

		<div class="col-md-2" role="complementary">
			<ul class="nav nav-pills nav-stacked painel"
				style="background-color: #eee">
				<li><a href="/">Metas</a></li>
				<li class="active"><a href="#">Cadastrar Metas</a></li>
				<li><a href="/editar">Editar Metas</a></li>
			</ul>
		</div>

		<!--  Conteudo Central -->
		<div class="col-md-6">
			<div class="panel panel-primary">
  				<div class="panel-heading">Cadastrar Metas</div>
  					<div class="panel-body">
						<div class="alert alert-success">
							<button type="button" class="close" data-dismiss="alert">×</button>
							<h4>Aviso</h4>
							Insira as Informações abaixo
						</div>
			
						<form role="form" action="/cadastro/novo" method="post">
							<!--  Descrição -->
							<div class="form-group">
							
								"""),_display_(Seq[Any](/*34.10*/inputText(meta("descricao"), '_label -> "Descrição", 'class -> "form-control"))),format.raw/*34.88*/("""
														
								"""),_display_(Seq[Any](/*36.10*/inputDate(meta("dataFinalizacao"), '_label -> "Data de Finalização", 'class -> "form-control"))),format.raw/*36.104*/("""
																	
								"""),_display_(Seq[Any](/*38.10*/select(meta("prioridade"), options = Seq("1" -> "MINIMO", "2" -> "BAIXO",
								"3" -> "NORMAL","4" -> "ALTO","5" -> "URGENTE") , '_label -> "Prioridade", 'class-> "form-control"))),format.raw/*39.108*/("""
								
							</div>
			
							<div align="right">
								<button type="submit" class="btn btn-primary">Cadastrar</button>
							</div>
			
						</form>
				  </div>
			</div>
		</div>
	</div>
</div>
""")))})))}
    }
    
    def render(meta:Form[models.Meta]): play.api.templates.HtmlFormat.Appendable = apply(meta)
    
    def f:((Form[models.Meta]) => play.api.templates.HtmlFormat.Appendable) = (meta) => apply(meta)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 13:31:05 BRT 2014
                    SOURCE: /home/master/vera/lab2-parte2-si1/app/views/cadastro.scala.html
                    HASH: 7140ab484fdfedb3c6a90036c5c29f2ad6a7f4ff
                    MATRIX: 788->1|923->26|950->44|987->47|1018->70|1056->71|1968->947|2068->1025|2129->1050|2246->1144|2310->1172|2514->1353
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|62->34|62->34|64->36|64->36|66->38|67->39
                    -- GENERATED --
                */
            