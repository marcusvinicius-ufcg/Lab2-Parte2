
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
object alterar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[models.Meta],play.api.templates.HtmlFormat.Appendable] {

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
  				<div class="panel-heading">Alterar Informações</div>
  					<div class="panel-body">
						<div class="alert alert-warning">
							<button type="button" class="close" data-dismiss="alert">×</button>
							<h4>Aviso</h4>
							Insira as Informações abaixo
						</div>
			
						"""),_display_(Seq[Any](/*31.8*/form(routes.Application.alterar(id))/*31.44*/ {_display_(Seq[Any](format.raw/*31.46*/("""
							<!--  Descrição -->
							<div class="form-group">
								
								"""),_display_(Seq[Any](/*35.10*/inputText(meta("descricao"), '_label -> "Descrição", 'class -> "form-control"))),format.raw/*35.88*/("""
								
							</div>
			
							<!--  Data -->
							<div class="form-group">
								"""),_display_(Seq[Any](/*41.10*/inputDate(meta("dataFinalizacao"), '_label -> "Data de Finalização", 'class -> "form-control"))),format.raw/*41.104*/("""
							</div>
			
							<!--  Prioridade -->
							<div class="form-group">		
								"""),_display_(Seq[Any](/*46.10*/select(meta("status"), options = Seq("true" -> "CONCLUÍDO", "false" -> "ABERTA") , '_label -> "Status", 'class-> "form-control"))),format.raw/*46.138*/("""
								
							</div>
							
							<!--  Prioridade -->
							<div class="form-group">		
								"""),_display_(Seq[Any](/*52.10*/select(meta("prioridade"), options = Seq("1" -> "MINIMO", "2" -> "BAIXO",
								"3" -> "NORMAL","4" -> "ALTO","5" -> "URGENTE") , '_label -> "Prioridade", 'class-> "form-control"))),format.raw/*53.108*/("""
								
							</div>
			
							<div align="right">
								<button type="submit" class="btn btn-primary">Salva Alterações</button>
							</div>
			
						""")))})),format.raw/*61.8*/("""
						</div>
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
                    SOURCE: /home/master/vera/lab2-parte2-si1/app/views/alterar.scala.html
                    HASH: 5fbf259290f36d71fb7e22de4354626a3c222bf0
                    MATRIX: 792->1|937->36|964->54|1001->57|1032->80|1070->81|1864->840|1909->876|1949->878|2063->956|2163->1034|2290->1125|2407->1219|2533->1309|2684->1437|2823->1540|3027->1721|3218->1881
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|59->31|59->31|59->31|63->35|63->35|69->41|69->41|74->46|74->46|80->52|81->53|89->61
                    -- GENERATED --
                */
            