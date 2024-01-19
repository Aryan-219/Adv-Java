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

    <script>
        let btn = document.querySelector('#btn');
        
        let collectNames = async () => {
            let response = await fetch('send.do');
            let result = await response.text();

            return result;
        };

        btn.addEventListener('click', () => {
            collectNames().then((data)=>{
                console.log(typeof data);
                let arr = JSON.parse(data);
                console.log(arr);
                console.log(typeof arr);
            }).catch((err)=>{
                console.log(error);
            });
        });
    </script>
</body>
</html>