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

    <!-- <form action="upload.do" method="post" enctype="multipart/form-data">
        <input type="file" name="mypic" id="mypic">
        <input type="submit" value="Upload">
    </form> -->

    <form action="#">
        <input type="file" id="mypic">
        <input type="button" id="btn" value="Upload">
    </form>

    <script>
        let btn = document.querySelector('#btn');
        let mypic = document.querySelector('#mypic');
        let form = document.forms[0];

        let uploadMyPic = async () => {
            let formData = new FormData();
            formData.append("file", mypic.files[0]);

            await fetch('upload.do', {
                method: 'post',
                body: formData
            });
        };

        btn.addEventListener('click', () => {
            uploadMyPic();
            form.reset();
        });
    </script>
</body>
</html>