<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: All Questions ::</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>
<body>
    <div class="container-fluid">
        <!-- ############################### -- Header -- ###################################-->
        <c:import url="header.jsp" />
        
        <!-- ############################### -- breadcrumb -- ###################################-->
        <div class="row mt-4">
            <div class="col-1"></div>
            <div class="col-10">
                <nav>
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="index.do">Topics</a></li>
                        <li class="breadcrumb-item active">All Questions</li>
                    </ol>
                </nav>
            </div>
            <div class="col-1"></div>
        </div>

        <!-- ############################### -- Page Body -- ###################################-->
        <div class="row mb-5">
            <div class="col-1"></div>
            <div class="col-10">
                <h3 class="my-3 py-3 bg-light text-primary ps-3 rounded-2">All Questions</h3>

                <div class="border border-secondary rounded-3 p-4 mb-4">
                    <h3 class="pb-2">How to create your first Java program</h3>
                    <hr>
                    <p class="mt-3">
                        <span class="text-muted me-5"><b>Posted By:</b> Gopal Prasad</span>
                        <span class="text-muted float-end"><b>Post Date:</b> 12 JAN, 2023 02:34PM GMT</span>
                    </p>                    
                    <p class="lead">
                        fugiat quod dolorum delectus quos non voluptatum. Dolore possimus unde impedit modi in ut saepe, officia sequi, cumque pariatur placeat eius, ducimus magni. Delectus aliquam voluptas eum nobis!
                    </p>   
                    <hr>
                    <p class="pb-1">
                        <span class="float-start">
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Share">share</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Add To Wishlist">favorite</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Like">thumb_up</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Dislike">thumb_down</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Reply">reply</span>                            
                        </span>
                        <span class="float-end">                            
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Edit">edit</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;color:red" title="Delete">delete</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Spam">warning</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Block">block</span>
                        </span>
                    </p> 
                </div>

                <div class="border border-secondary rounded-3 p-4">
                    <h3 class="pb-2">How to create your first Java program</h3>
                    <hr>
                    <p class="mt-3">
                        <span class="text-muted me-5"><b>Posted By:</b> Gopal Prasad</span>
                        <span class="text-muted float-end"><b>Post Date:</b> 12 JAN, 2023 02:34PM GMT</span>
                    </p>                    
                    <p class="lead">
                        ecusandae qui fugiat quod dolorum delectus quos non voluptatum. Dolore possimus unde impedit modi in ut saepe, officia sequi, cumque pariatur placeat eius, ducimus magni. Delectus aliquam voluptas eum nobis!
                    </p>   
                    <hr>
                    <p class="pb-1">
                        <span class="float-start">
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Share">share</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Add To Wishlist">favorite</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Like">thumb_up</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Dislike">thumb_down</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Reply">reply</span>                            
                        </span>
                        <span class="float-end">                            
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Edit">edit</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;color:red" title="Delete">delete</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Spam">warning</span>
                            <span class="material-symbols-outlined pe-3" style="font-size:1.7rem;" title="Block">block</span>                        
                        </span>
                    </p> 
                </div>
            </div>
            <div class="col-1"></div>
        </div>
        
        <!-- ############################### -- Footer -- ###################################-->
        <c:import url="footer.jsp" />
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>