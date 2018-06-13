# Strike Text VieW Sample
[![](https://jitpack.io/v/mukkumukesh/strikeTextVievSample.svg)](https://jitpack.io/#mukkumukesh/strikeTextVievSample)
<p>To get a Git project into your build:</p>
<p><b>Step 1.</b> Add the JitPack repository to your build file</p>
<p>Add it in your root build.gradle at the end of repositories:</p>
<pre><code>	<span>allprojects</span> <span>{</span>
		<span>repositories</span> <span class="token punctuation">{</span>
			<span>...
			maven</span> <span>{</span> url <span>'https://jitpack.io'</span> <span>}</span>
		<span>}</span>
	<span>}</span></code></pre>
  <p><b>Step 2.</b> Add the dependency</p>
  <pre><code id="depCodeGradle">	<span>dependencies</span> <span>{</span>
	        implementation <span>'com.github.mukkumukesh:strikeTextVievSample:v1.0'</span>
	<span>}</span>
</code></pre>
<p><b>XML Properties</b></p>
<p>There are some custom properties which you can use</p>
<p>1. To change font family use <code>app:fontName="Titillium-Regular.otf"</code></p>
<p>2. To change line color use <code>app:lineColor="#FF4081"</code></p>
<p>3. To change line height use <code>app:lineHeight="5"</code></p>
<p><strong>Example</strong></p>
<pre>
  <code>
        &ltcom.sample.striketextview.StrikeTextView
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:layout_gravity="center"
          android:layout_margin="@dimen/margin_large"
          android:text="@string/app_name"
          app:lineColor="@color/colorAccent"
          app:lineHeight="5" /&gt
  </code>
</pre>
