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

    <button id="btn">Send Request</button>

    <!-- <script>
        let btn = document.getElementById('btn');
        let request = null;

        function handleResponse() {'send.do
            if(request.readyState == 4 && request.status == 200) {
                console.log(request.responseText);
            }
        }

        function sendRequest() {
            request = new XMLHttpRequest();
            request.open('get', ', true);
            request.onreadystatechange = handleResponse;
            request.send(null);
        }

        btn.onclick = sendRequest;
    </script> -->

    <script>
        let btn = document.querySelector('#btn');

        let sendRequest = async () => {
            let response = await fetch('send.do');
            let result = await response.text();

            return result;
        };

        btn.addEventListener('click', () => {
            sendRequest().then((data)=>{
                console.log(data);
            }).catch((error)=>{
                console.log(error);
            });
        });
    </script>
</body>
</html>