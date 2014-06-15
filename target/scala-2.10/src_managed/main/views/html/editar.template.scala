
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
object editar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.Meta],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(metas: List[models.Meta]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Gerenciador de Metas")/*4.30*/{_display_(Seq[Any](format.raw/*4.31*/("""

<div class="container-fluid">
	<div class="row">
		
		<!--  Barra Lateral -->
		<div class="col-md-2" role="complementary">
			<ul class="nav nav-pills nav-stacked" style="background-color: #eee">
				<li><a href="/">Metas</a></li>
				<li><a href="/cadastro">Cadastrar Metas</a></li>
				<li class="active"><a href="/editar">Editar Metas</a></li>
			</ul>
		</div>		
		

		<!--  Conteudo Central -->
		<div class="col-md-10">
			
			<div class="panel panel-primary">
  				<div class="panel-heading">Edição de Metas</div>
  					<div class="panel-body">
    					<table class="table table-striped table-condensed table-hover">
							<thead>
								<tr>
									<th width="170">Data</th>
									<th>Descrição</th>
									<th width="100">Prioridade</th>
									<th width="130">Status</th>
									<th width="115">Opções</th>
								</tr>
							</thead>
							"""),_display_(Seq[Any](/*35.9*/if(!metas.isEmpty)/*35.27*/{_display_(Seq[Any](format.raw/*35.28*/("""
								<tbody>
									"""),_display_(Seq[Any](/*37.11*/for(meta <- metas) yield /*37.29*/{_display_(Seq[Any](format.raw/*37.30*/("""
										
										"""),_display_(Seq[Any](/*39.12*/if(meta.isStatus())/*39.31*/{_display_(Seq[Any](format.raw/*39.32*/("""

											<tr class="success">
												<td align="center">"""),_display_(Seq[Any](/*42.33*/meta/*42.37*/.getDataFormatada())),format.raw/*42.56*/("""</td>
												<td>"""),_display_(Seq[Any](/*43.18*/meta/*43.22*/.getDescricao())),format.raw/*43.37*/("""</td>
												<td>"""),_display_(Seq[Any](/*44.18*/meta/*44.22*/.getPrioridadeFormatada())),format.raw/*44.47*/("""</td>
												<td>CONCLUÍDA</td>
												<td>
													<div class="row">
													  <div class="col-md-5">
														  <form class="control-group" action="/editar/meta" method="post">
															<button class='btn btn-xs btn-success' type="submit" id=""""),_display_(Seq[Any](/*50.74*/meta/*50.78*/.getId())),format.raw/*50.86*/("""" name="ID" value=""""),_display_(Seq[Any](/*50.106*/meta/*50.110*/.getId())),format.raw/*50.118*/("""">Editar</button>
														</form>
													  </div>
													  
													  <div class="col-md-5">
													  	<form class="control-group" action="/remover/meta" method="post">
															<button class='btn btn-xs btn-danger' type="submit" id=""""),_display_(Seq[Any](/*56.73*/meta/*56.77*/.getId())),format.raw/*56.85*/("""" name="ID" value=""""),_display_(Seq[Any](/*56.105*/meta/*56.109*/.getId())),format.raw/*56.117*/("""">Excluir</button>
														</form>
													  </div>
													</div>
												</td>
											</tr>
											
											""")))}/*63.13*/else/*63.17*/{_display_(Seq[Any](format.raw/*63.18*/("""
											<tr class=warning>
												<td align="center">"""),_display_(Seq[Any](/*65.33*/meta/*65.37*/.getDataFormatada())),format.raw/*65.56*/("""</td>
												<td>"""),_display_(Seq[Any](/*66.18*/meta/*66.22*/.getDescricao())),format.raw/*66.37*/("""</td>
												<td>"""),_display_(Seq[Any](/*67.18*/meta/*67.22*/.getPrioridadeFormatada())),format.raw/*67.47*/("""</td>
												<td>ABERTA</td>
												<td>
													<div class="row">
													  <div class="col-md-5">
														  <form class="control-group" action="/editar/meta" method="post">
															<button class='btn btn-xs btn-success' type="submit" id=""""),_display_(Seq[Any](/*73.74*/meta/*73.78*/.getId())),format.raw/*73.86*/("""" name="ID" value=""""),_display_(Seq[Any](/*73.106*/meta/*73.110*/.getId())),format.raw/*73.118*/("""">Editar</button>
														</form>
													  </div>
													  
													  <div class="col-md-5">
													  	<form class="control-group" action="/remover/meta" method="post">
															<button class='btn btn-xs btn-danger' type="submit" id=""""),_display_(Seq[Any](/*79.73*/meta/*79.77*/.getId())),format.raw/*79.85*/("""" name="ID" value=""""),_display_(Seq[Any](/*79.105*/meta/*79.109*/.getId())),format.raw/*79.117*/("""">Excluir</button>
														</form>
													  </div>
													</div>
												</td>
											</tr>
										""")))})),format.raw/*85.12*/("""
									""")))})),format.raw/*86.11*/("""
								</tbody>
							""")))})),format.raw/*88.9*/("""
						</table>
  					</div>
				</div>
			</div>
		</div>
	</div>
</div>
""")))})),format.raw/*96.2*/("""
"""))}
    }
    
    def render(metas:List[models.Meta]): play.api.templates.HtmlFormat.Appendable = apply(metas)
    
    def f:((List[models.Meta]) => play.api.templates.HtmlFormat.Appendable) = (metas) => apply(metas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 13:31:05 BRT 2014
                    SOURCE: /home/master/vera/lab2-parte2-si1/app/views/editar.scala.html
                    HASH: 25436f2553958e8e2bc04ebe8e52750a97772831
                    MATRIX: 786->1|922->27|949->45|985->47|1021->75|1059->76|1968->950|1995->968|2034->969|2097->996|2131->1014|2170->1015|2229->1038|2257->1057|2296->1058|2398->1124|2411->1128|2452->1147|2511->1170|2524->1174|2561->1189|2620->1212|2633->1216|2680->1241|2993->1518|3006->1522|3036->1530|3093->1550|3107->1554|3138->1562|3444->1832|3457->1836|3487->1844|3544->1864|3558->1868|3589->1876|3750->2018|3763->2022|3802->2023|3901->2086|3914->2090|3955->2109|4014->2132|4027->2136|4064->2151|4123->2174|4136->2178|4183->2203|4493->2477|4506->2481|4536->2489|4593->2509|4607->2513|4638->2521|4944->2791|4957->2795|4987->2803|5044->2823|5058->2827|5089->2835|5250->2964|5293->2975|5350->3001|5457->3077
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|63->35|63->35|63->35|65->37|65->37|65->37|67->39|67->39|67->39|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|78->50|78->50|78->50|78->50|78->50|78->50|84->56|84->56|84->56|84->56|84->56|84->56|91->63|91->63|91->63|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|101->73|101->73|101->73|101->73|101->73|101->73|107->79|107->79|107->79|107->79|107->79|107->79|113->85|114->86|116->88|124->96
                    -- GENERATED --
                */
            