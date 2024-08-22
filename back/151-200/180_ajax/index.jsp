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

    <button id="btn">Show Records</button>

    <script>
        let btn = document.querySelector('#btn');

        btn.addEventListener('click', ()=>{
            let req = new XMLHttpRequest();

            req.open('GET', 'records.do', true);

            req.addEventListener('readystatechange', () => {
                console.log(req.readyState);

                if(req.readyState == 4 && req.status == 200) {                    
                    
                    //Case 1:
                    // let x = req.responseText;

                    // for(let y of x) {
                    //     console.log(y);
                    // }

                    //Case 2:
                    // let json = JSON.parse(req.responseText);

                    // for(let y of json) {
                    //     console.log(y);
                    // }
                }
            });

            req.send();
        });
    </script>

</body>
</html>