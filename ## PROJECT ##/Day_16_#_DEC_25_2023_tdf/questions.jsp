<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="a" uri="http://localhost:8080/tdf" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: All Questions ::</title>
    <link rel="icon" href="static/images/tdf_logo.ico">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>
<body>
    <!-- ---------------- POST QUESTION MODAL ----------------------- -->
    <div class="modal fade" id="post_question_box">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <h2 class="modal-title">Post Question</h2>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                </div>
                <div class="modal-body">
                    <div class="mb-3">
                        <label for="question_title" class="form-label">Question Title</label>
                        <input type="text" id="question_title" class="form-control">
                    </div>
                    <div class="mb-3">
                        <label for="question_content" class="form-label">Question</label>
                        <textarea id="question_content" rows="7" class="form-control"></textarea>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" id="post_question_btn">Post Question</button>
                    <button type="button" data-bs-dismiss="modal" class="btn btn-secondary">Close</button>
                </div>
            </div> 
        </div>
    </div>
    <!-- ---------------- POST QUESTION MODAL ----------------------- END -->


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
                <h3 class="my-3 py-3 bg-light text-primary ps-3 rounded-2">
                    <span>${param.topic_name}<h6 class="d-inline-block ms-3">(All Questions)</h6></span>
                    <button type="button" class="btn btn-primary float-end me-3" data-bs-toggle="modal" data-bs-target="#post_question_box">Post Question</button>
                </h3>

                <c:forEach var="question" items="${questions}" varStatus="cn">
                    <div class="border border-secondary rounded-3 p-4 mb-4">
                        <h3 class="pb-2">${question.title}</h3>
                        <hr>
                        <p class="mt-3">
                            <span class="text-muted me-5"><b>Posted By:</b> ${question.post.user.name}</span>
                            <span class="text-muted float-end"><b>Post Date:</b> ${a:formatDate(question.post.postedOn)}</span>
                        </p>                    
                        <p class="lead">
                            ${question.post.post}
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
                </c:forEach>
            </div>
            <div class="col-1"></div>
        </div>
        
        <!-- ############################### -- Footer -- ###################################-->
        <c:import url="footer.jsp" />
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

    <script>
        let post_question_btn = document.querySelector('#post_question_btn');
        let question_title = document.querySelector('#question_title');
        let question_content = document.querySelector('#question_content');

        let post_question = async () => {
            let response = await fetch('post_question.do?title='+question_title.value+'&content='+question_content.value+'&topic_id='+${param.topic_id});
            let result = await response.text();

            return result;
        };

        post_question_btn.addEventListener('click', () => {
            post_question().then((data)=>{
                console.log(data);
            }).catch((err)=>{
                console.log(err);
            });
        });

    </script>
</body>
</html>

