
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
object remover extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[models.Meta],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, meta: Form[models.Meta]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main("Cadastrar Metas")/*5.25*/{_display_(Seq[Any](format.raw/*5.26*/("""
<div class="container-fluid">
	<div class="row">
		<!--  Barra Lateral -->

		<div class="col-md-2" role="complementary">
			<ul class="nav nav-pills nav-stacked painel"
				style="background-color: #eee">
				<li><a href="/">Metas</a></li>
				<li><a href="/cadastro">Cadastrar Metas</a></li>
				<li class="active"><a href="/editar">Editar Metas</a></li>
			</ul>
		</div>

		<!--  Conteudo Central -->
		<div class="col-md-6">
		
			<div class="panel panel-primary">
  				<div class="panel-heading">Remover Metas</div>
  					<div class="panel-body">
		
						<div class="alert alert-danger">
							<button type="button" class="close" data-dismiss="alert">×</button>
							<h4>Aviso</h4>
							Essa ação não poderá ser revertida!
						</div>
			
						"""),_display_(Seq[Any](/*32.8*/form(routes.Application.remover(id))/*32.44*/ {_display_(Seq[Any](format.raw/*32.46*/("""
							<!--  Descrição -->
							<div class="form-group">
								
								"""),_display_(Seq[Any](/*36.10*/inputText(meta("descricao"), '_label -> "Descrição", 'class -> "form-control"))),format.raw/*36.88*/("""
								
							</div>
			
							<!--  Data -->
							<div class="form-group">
								"""),_display_(Seq[Any](/*42.10*/inputDate(meta("dataFinalizacao"), '_label -> "Data de Finalização", 'class -> "form-control"))),format.raw/*42.104*/("""
							</div>
			
							<!--  Prioridade -->
							<div class="form-group">		
								"""),_display_(Seq[Any](/*47.10*/select(meta("prioridade"), options = Seq("1" -> "MINIMO", "2" -> "BAIXO",
								"3" -> "NORMAL","4" -> "ALTO","5" -> "URGENTE") , '_label -> "Prioridade", 'class-> "form-control"))),format.raw/*48.108*/("""
								
							</div>
			
							<div align="right">
								<button type="submit" class="btn btn-danger">Excluir Meta</button>
							</div>
			
						""")))})),format.raw/*56.8*/("""
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
""")))})))}
    }
    
    def render(id:Long,meta:Form[models.Meta]): play.api.templates.HtmlFormat.Appendable = apply(id,meta)
    
    def f:((Long,Form[models.Meta]) => play.api.templates.HtmlFormat.Appendable) = (id,meta) => apply(id,meta)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 13:31:05 BRT 2014
                    SOURCE: /home/master/vera/lab2-parte2-si1/app/views/remover.scala.html
                    HASH: ced9292b98bebf859ddd626f60933202784af7cb
                    MATRIX: 792->1|937->36|964->54|1001->57|1032->80|1070->81|1867->843|1912->879|1952->881|2066->959|2166->1037|2293->1128|2410->1222|2536->1312|2740->1493|2926->1648
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|60->32|60->32|60->32|64->36|64->36|70->42|70->42|75->47|76->48|84->56
                    -- GENERATED --
                */
            