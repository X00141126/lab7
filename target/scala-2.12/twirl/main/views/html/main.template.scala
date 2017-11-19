
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pageID: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en" id=""""),_display_(/*4.22*/pageID),format.raw/*4.28*/("""">
    <head>
        <title>Core Design - """),_display_(/*6.31*/pageID),format.raw/*6.37*/("""</title> 
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.at("stylesheets/Style.css")),format.raw/*7.96*/("""" />
    </head>
    <body>
        <div id="Container">
            <div id="Logo">
                <h1>Core Design</h1>
                <h3> 
                    <em>Website Design...</em>
                </h3>
            </div>
            <nav>
                <ul>
                    <li><a href=""""),_display_(/*19.35*/routes/*19.41*/.HomeController.index()),format.raw/*19.64*/("""">Home</a></li>
                    <li><a href=""""),_display_(/*20.35*/routes/*20.41*/.HomeController.about()),format.raw/*20.64*/("""">About Us</a></li>
                    <li><a href=""""),_display_(/*21.35*/routes/*21.41*/.HomeController.services()),format.raw/*21.67*/("""">Services</a></li>
                    <li><a href=""""),_display_(/*22.35*/routes/*22.41*/.HomeController.clients()),format.raw/*22.66*/("""">Clients</a></li>
                    <li><a href=""""),_display_(/*23.35*/routes/*23.41*/.HomeController.contact()),format.raw/*23.66*/("""">Contact Us</a></li>
                </ul>
            </nav>
            <div id="Content">
                """),_display_(/*27.18*/content),format.raw/*27.25*/("""                    
            """),format.raw/*28.13*/("""</div>

            <footer>
                <h6>
                    <em>Copyright &copy; 2015 Core Design</em>
                </h6>
            </footer>
        </div>
        <script src=""""),_display_(/*36.23*/routes/*36.29*/.Assets.at("javascripts/main.js")),format.raw/*36.62*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(pageID:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageID)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageID) => (content) => apply(pageID)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Nov 19 13:15:39 GMT 2017
                  SOURCE: /home/laralagioia/webapps/WWDD1CoreDesignLab/app/views/main.scala.html
                  HASH: 7a836a598a63767fbe318eb07906494bf8cfa518
                  MATRIX: 952->1|1078->32|1106->34|1169->71|1195->77|1265->121|1291->127|1381->191|1395->197|1450->232|1782->537|1797->543|1841->566|1918->616|1933->622|1977->645|2058->699|2073->705|2120->731|2201->785|2216->791|2262->816|2342->869|2357->875|2403->900|2541->1011|2569->1018|2630->1051|2851->1245|2866->1251|2920->1284
                  LINES: 28->1|33->1|35->3|36->4|36->4|38->6|38->6|39->7|39->7|39->7|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|59->27|59->27|60->28|68->36|68->36|68->36
                  -- GENERATED --
              */
          