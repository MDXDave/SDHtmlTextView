package com.sysdata.kt.sdhtmltextview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.htmlText="<h1>That's a header 1</h1><h2>That's a header 2</h2><h3>That's a header 3</h3><h4>That's a header 4</h4><h5>That's a header 5</h5><h6>That's a header 6</h6>NomeCognome<br />MarioRossi<div style=\"line-height:30px\">Some text displayed in center position into a paragraph <span style=\"background-color:blue; color:white\">other text</span> (<code>span</code> markup used);<br /><big>big thing</big> (<code>big</code> markup used)<br /><small>this is not that important</small> (<code>small</code> markup used)<br />this is <em>very</em> simple (<code>em</code> markup used for emphasizing a word)<br /><cite>Origin of Species</cite> (a book title;<code>cite</code> markup used)<br /><em>Homo sapiens</em> (should appear in italics; <code>i</code> markup used)<br /><br /><strong>bolded</strong> (<code>b</code> markup used - just bolding with unspecified semantics)<div style=\"line-height:24px\"><br />&nbsp;</div><tt>text in monospace font</tt> (<code>tt</code> markup used)<br /><u>underlined</u> text (<code>u</code> markup used)<br /><strong>bolded</strong> (<code>strong</code> markup used)<ul><li>Test: <span>large size</span> (<code>font size=30px</code> markup used)</li><li>Test: <span style=\"color:red\">red text</span> (<code>font color=red</code> markup used)</li></ul>a<sub>B</sub> (<code>sub</code> markup used)<br />a<sup>C</sup> (<code>sup</code> markup used)</div><ol style=\"list-style-position:inside;\"><li>list element 1</li><li>list element 2</li></ol><div style=\"line-height:50px\">that's a div body and a line-height<br />with a <code>br</code> inside and a font styling<br /><span style=\"font-size:30px\">large size</span> (<code>style=&quot;font-size:30px&quot;</code> markup used)<br /><span style=\"font-family:Courier\">Courier font</span> (<code>style=&quot;font-family:Courier&quot;</code> markup used)<br /><span style=\"color:red\">red text</span> (<code>style=&quot;color:red&quot;</code> markup used)<br /><em>italic text</em> (<code>style=&quot;font-style:italic&quot;</code> markup used)<p style=\"text-align:left\">left text</p><p style=\"text-align:center\">centered text</p><p style=\"text-align:right\">right text</p>deleted text</div>"
    }
}
