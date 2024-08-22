<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>

    <hr>

    <input type="button" value="Send Ajax Request" id="btn">

    <script>
        let btn = document.querySelector('#btn');

        let req = null;

        function handleResponse() {
            console.log(req.readyState + '------------');
        }

        function sendRequest() {
            req = new XMLHttpRequest();
            console.log(req.readyState);
            
            req.open('get', 'send_req.do', true);
            console.log(req.readyState);
            
            req.onreadystatechange = handleResponse;
            
            req.send();
            console.log(req.readyState);
        }

        btn.onclick = sendRequest;
    </script>
</body>
</html>