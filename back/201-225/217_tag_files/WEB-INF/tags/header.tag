<%@ attribute name="klass" required="true" rtexprvalue="false" %>

<%@ tag body-content="tagdependent" %>

<link rel='stylesheet' href='common.css'>

<div class="${klass}">
    <h1>My Company <jsp:doBody /></h1>

    <span>We are the best...</span>
</div> 