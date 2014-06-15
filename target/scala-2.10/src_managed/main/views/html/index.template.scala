
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[models.Meta],List[Long],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(metas: List[models.Meta], semanas: List[Long]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.49*/("""


"""),_display_(Seq[Any](/*4.2*/main("Gerenciador de Metas")/*4.30*/{_display_(Seq[Any](format.raw/*4.31*/("""
<div class="container-fluid">
	<div class="row">
		<!--  Barra Lateral -->

		<div class="col-md-2">
			<ul class="nav nav-pills nav-stacked" style="background-color: #eee">
				<li class="active"><a href="#">Metas</a></li>
				<li><a href="/cadastro">Cadastrar Metas</a></li>
				<li><a href="/editar">Editar Metas</a></li>
			</ul>
		</div>

		<!--  Conteudo Central -->
		<div class="col-md-10">
			<div>

				"""),_display_(Seq[Any](/*21.6*/for(semana <- semanas) yield /*21.28*/{_display_(Seq[Any](format.raw/*21.29*/("""
				<div class="panel panel-primary">
					<div class="panel-heading">Gerenciador de  Metas </div>
						<div class="panel-body">
	  						
	  						
	    						<table class="table table-striped table-condensed table-hover">
									<thead>
										<tr>
											<th width="170">Data</th>
											<th>Descrição</th>
											<th width="100">Prioridade</th>
											<th width="130">Status</th>
										</tr>
									</thead>
									
									"""),_display_(Seq[Any](/*37.11*/if(!metas.isEmpty)/*37.29*/{_display_(Seq[Any](format.raw/*37.30*/("""
										<tbody>
											"""),_display_(Seq[Any](/*39.13*/for(meta <- metas) yield /*39.31*/{_display_(Seq[Any](format.raw/*39.32*/("""
												"""),_display_(Seq[Any](/*40.14*/if(meta.getSemana() == semana)/*40.44*/{_display_(Seq[Any](format.raw/*40.45*/("""
													"""),_display_(Seq[Any](/*41.15*/if(meta.isStatus())/*41.34*/{_display_(Seq[Any](format.raw/*41.35*/("""
														<tr class="success">
															<td align="center">"""),_display_(Seq[Any](/*43.36*/meta/*43.40*/.getDataFormatada())),format.raw/*43.59*/("""</td>
															<td>"""),_display_(Seq[Any](/*44.21*/meta/*44.25*/.getDescricao())),format.raw/*44.40*/("""</td>
															<td>"""),_display_(Seq[Any](/*45.21*/meta/*45.25*/.getPrioridadeFormatada())),format.raw/*45.50*/("""</td>
															<td>CONCLUÍDA</td>
														</tr>
													
													""")))}/*49.15*/else/*49.19*/{_display_(Seq[Any](format.raw/*49.20*/("""
														<tr class=warning>
															<td align="center">"""),_display_(Seq[Any](/*51.36*/meta/*51.40*/.getDataFormatada())),format.raw/*51.59*/("""</td>
															<td>"""),_display_(Seq[Any](/*52.21*/meta/*52.25*/.getDescricao())),format.raw/*52.40*/("""</td>
															<td>"""),_display_(Seq[Any](/*53.21*/meta/*53.25*/.getPrioridadeFormatada())),format.raw/*53.50*/("""</td>
															<td>ABERTA</td>
														</tr>
													""")))})),format.raw/*56.15*/("""
												""")))})),format.raw/*57.14*/("""
											""")))})),format.raw/*58.13*/("""
										</tbody>
									""")))})),format.raw/*60.11*/("""
								</table>
						</div>
					</div>
					
					""")))})),format.raw/*65.7*/("""
				</div>
			</div>			
		</div>
	</div>
</div>
""")))})),format.raw/*71.2*/("""
"""))}
    }
    
    def render(metas:List[models.Meta],semanas:List[Long]): play.api.templates.HtmlFormat.Appendable = apply(metas,semanas)
    
    def f:((List[models.Meta],List[Long]) => play.api.templates.HtmlFormat.Appendable) = (metas,semanas) => apply(metas,semanas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 13:32:41 BRT 2014
                    SOURCE: /home/master/vera/lab2-parte2-si1/app/views/index.scala.html
                    HASH: 60c50675825b93ec0a22e75bb7d166b342f1b3c8
                    MATRIX: 796->1|937->48|975->52|1011->80|1049->81|1499->496|1537->518|1576->519|2073->980|2100->998|2139->999|2206->1030|2240->1048|2279->1049|2329->1063|2368->1093|2407->1094|2458->1109|2486->1128|2525->1129|2632->1200|2645->1204|2686->1223|2748->1249|2761->1253|2798->1268|2860->1294|2873->1298|2920->1323|3027->1411|3040->1415|3079->1416|3184->1485|3197->1489|3238->1508|3300->1534|3313->1538|3350->1553|3412->1579|3425->1583|3472->1608|3575->1679|3621->1693|3666->1706|3728->1736|3814->1791|3895->1841
                    LINES: 26->1|29->1|32->4|32->4|32->4|49->21|49->21|49->21|65->37|65->37|65->37|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|77->49|77->49|77->49|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|84->56|85->57|86->58|88->60|93->65|99->71
                    -- GENERATED --
                */
            