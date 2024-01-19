<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%! 
        int golu = 89; 

        public int getGolu() {
            return golu;
        }
    %>

    <h1>EL Demo</h1>

    <hr>
     
    ${pageContext.page}

    <hr>    
    ${pageContext.page.golu}

    <hr>

    ${pageContext.session}

    <hr>

    ${pageContext.out}

    <hr>

    <%--${pageContext.attribute}--%>
    <%--${pageContext.attribute("golu")}--%>

    <hr>

    ${pageContext.errorData}

    <hr>

    ${pageContext.ELContext}
</body>
</html>