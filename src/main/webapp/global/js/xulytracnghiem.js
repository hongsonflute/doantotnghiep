$('#baitest1').click(function () {
   $('#noidungbaitest').prop('hidden',false);

});
$('input[type=radio]').click(function () {
if ($('input[type=radio]:checked').length > 0) {
    $('#cauTestTiep').prop('hidden',false);
}});
$('#cauTestTiep').click(function () {
    $('#cautestthu').text('Câu 2');
    $('#cauhoitest').text('hihihi');
    $('#dapantest1').text('hihihi');
    $('#dapantest2').text('hihihi');
    $('#dapantest3').text('hihihi');
    $('#dapantest4').text('hihihi');
    $('#sodiem').text('20');
});


/*
------------xu ly admin them cau hoi----------*/
var tongdiem=0;
function testdungA(id) {
    var diemcau=0;
    var idA = "answerA_" + id;
    var isTrue = "isTrue_" + id;
    var A = document.getElementById(idA).value;
    var KQ = document.getElementById(isTrue).value;
    console.log(tongdiem);
    if (A == KQ) {
        diemcau=1 ;
        console.log(diemcau);
    } else {
        diemcau=0;
    }

}
function testdungB(id) {
    diemcau=0;
    var idB = "answerB_" + id;
    var isTrue = "isTrue_" + id;
    var B = document.getElementById(idB).value;
    var KQ = document.getElementById(isTrue).value;
    if (B == KQ) {
        diemcau=1;
        console.log(diemcau);
    } else {
        diemcau=0;
    }

}
function testdungC(id) {
    diemcau=0;
    var idC = "answerC_" + id;
    var isTrue = "isTrue_" + id;
    var C = document.getElementById(idC).value;
    var KQ = document.getElementById(isTrue).value;
    if (C == KQ) {
       diemcau=1;
       console.log(diemcau);
    } else {
        diemcau=0;
    }

}
function testdungD(id) {
    diemcau=0;
    var idD = "answerD_" + id;
    var isTrue = "isTrue_" + id;
    var D = document.getElementById(idD).value;
    var KQ = document.getElementById(isTrue).value;
    if (D == KQ) {
        diemcau=1;
        console.log(diemcau);
    } else {
        diemcau=0
        console.log("sai");
    }

}




