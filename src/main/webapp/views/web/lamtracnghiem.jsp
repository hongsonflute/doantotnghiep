<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lam trac nghiem</title>
</head>

<body>
<span>${diem}</span>

<label> BÀI TRẮC NGHIỆM SỐ:</label>
<div>



        <c:forEach items="${tracNghiemModels}" var="x" varStatus="loop">
            <h5>Câu hỏi ${loop.index+1} </h5>
            <div class="checkcau">
                <p>${x.content}</p>
                <b>A </b><input type="radio" name="isTrue_${loop.index}" value="a" id="answerA_${x.idCauHoiTracNghiem}"
                                onclick="testdungA(${x.idCauHoiTracNghiem})">
                <p>${x.answerA}</p>
                <b>B </b><input type="radio" name="isTrue_${loop.index}" value="b" id="answerB_${x.idCauHoiTracNghiem}"
                                onclick="testdungB(${x.idCauHoiTracNghiem})">
                <p>${x.answerB}</p>
                <b>C </b><input type="radio" name="isTrue_${loop.index}" value="c" id="answerC_${x.idCauHoiTracNghiem}"
                                onclick="testdungC(${x.idCauHoiTracNghiem})">
                <p>${x.answerC}</p>
                <b>D </b><input type="radio" name="isTrue_${loop.index}" value="d" id="answerD_${x.idCauHoiTracNghiem}"
                                onclick="testdungD(${x.idCauHoiTracNghiem})">
                <p>${x.answerD}</p>
                <input type="text" value="${x.answerTrue}" id="isTrue_${{loop.index}}">
            </div>
        </c:forEach>

        <br>
            <input type="text" id="lessionid" value="${tracNghiemModels.get(0).lessionid}" >
        <input type="text" id="tongDiem" name="tongDiem"/>
        <input type="text" name="idBaiTracNghiem" value="${tracNghiemModels[0].idBaiTracNghiem}" id="idBaiTracNghiem">
        <input type="text" name="userId" value="${USERMODEL.id}" id="userId">
        <button  onclick="demCauDung()" id="kiemtravatinhdiem-">Kiểm Tra Kết Qủa</button>
</div>

<script>
    var idBaiTracNghiem=document.getElementById("idBaiTracNghiem").value;
    var userId=document.getElementById("userId").value;
    var lessionid=document.getElementById("lessionid").value;

    function demCauDung() {
        var diem = 0;
        var soCau = document.getElementsByClassName("checkcau");
        for (var i = 0; i < soCau.length; i++) {
            var radios = document.getElementsByName('isTrue_' + i + '');

            for (var j = 0, length = radios.length; j < length; j++) {
                if (radios[j].checked) {
                    // do whatever you want with the checked radio
                    var da = document.getElementById("isTrue_[" + i + "]").value;
                    if (radios[j].value == da)
                        diem++;
                }
            }
        }
        document.getElementById("tongDiem").value = diem;
        alert(diem + "/" + soCau.length);

        var string_diem = diem+"/"+soCau.length;

        $.ajax({
            url: '/test-trac-nghiem',
            type: 'post',
            data:{
                idBaiTracNghiem:idBaiTracNghiem,
                userId:userId,
                lessionid:lessionid,
                diemString:string_diem,
            },
            success: function (result) {
                console.log(result);
                window.location.href = "/lession-detail?action=detail&idLession="+lessionid;
            },
            error: function (error) {
                console.log(error);
            }
        });


    }
</script>

</body>
</html>