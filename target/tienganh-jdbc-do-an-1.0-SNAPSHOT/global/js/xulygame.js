
var duocChon=0;
function myMove() {
    $('#thongbaodung').prop('hidden',true);
    $('#thongbaosai').prop('hidden',true);
    if($('#a').val()==1){
        duocChon=1;
        console.log(duocChon);
    }else duocChon=0
    $("#dapan2").css({"left":'190px',"top":"300px"});
    $("#dapan3").css({"left":'300px',"top":"300px"});
    $("#dapan4").css({"left":'420px',"top":"300px"});
    var elem = document.getElementById("dapan1");
    var top = 300;
    var left=70;
    var id = setInterval(frame, 5);

    function frame() {
        if (top == 130) {

                clearInterval(id);
                // $("#dapan1").css("left", "300px");
            $("#dapan1").css({"left":'300px'});
                // $('#dapandung').prop('hidden',true);
        } else {
            top--;
            left++;
            elem.style.top = top + "px";
            elem.style.left = left + "px";
        }
    }
}
function myMove2() {
    $('#thongbaodung').prop('hidden',true);
    $('#thongbaosai').prop('hidden',true);
    if($('#b').val()==1){
        duocChon=1;
        console.log(duocChon);
    }else duocChon=0
    $("#dapan1").css({"left":'70px',"top":"300px"});
    $("#dapan3").css({"left":'300px',"top":"300px"});
    $("#dapan4").css({"left":'420px',"top":"300px"});
    var elem = document.getElementById("dapan2");
    var top = 300;
    var left= 190;
    var id = setInterval(frame, 5);

    function frame() {
        if (top == 130) {

            clearInterval(id);
            // $("#dapan1").css("left", "300px");
            $("#dapan2").css({"left":'300px'});
            // $('#dapandung').prop('hidden',true);
        } else {
            top--;
            left++;
            elem.style.top = top + "px";
            elem.style.left = left + "px";
        }
    }
}
function myMove3() {
    $('#thongbaodung').prop('hidden',true);
    $('#thongbaosai').prop('hidden',true);
    if($('#c').val()==1){
        duocChon=1;
        console.log(duocChon);
    }else duocChon=0
    $("#dapan1").css({"left":'70px',"top":"300px"});
    $("#dapan2").css({"left":'190px',"top":"300px"});
    $("#dapan4").css({"left":'420px',"top":"300px"});
    var elem = document.getElementById("dapan3");
    var top = 300;
    var left= 190;
    var id = setInterval(frame, 5);

    function frame() {
        if (top == 130) {

            clearInterval(id);
            // $("#dapan1").css("left", "300px");
            $("#dapan3").css({"left":'300px'});
            // $('#dapandung').prop('hidden',true);
        } else {
            top--;
            elem.style.top = top + "px";
        }
    }
}
function myMove4() {
    $('#thongbaodung').prop('hidden',true);
    $('#thongbaosai').prop('hidden',true);
    if($('#d').val()==1){
        duocChon=1;
        console.log(duocChon);
    }else duocChon=0
    $("#dapan1").css({"left":'70px',"top":"300px"});
    $("#dapan2").css({"left":'190px',"top":"300px"});
    $("#dapan3").css({"left":'300px',"top":"300px"});
    var elem = document.getElementById("dapan4");
    var top = 300;
    var left= 420;
    var id = setInterval(frame, 5);

    function frame() {
        if (top == 130) {

            clearInterval(id);
            // $("#dapan1").css("left", "300px");
            $("#dapan4").css({"left":'300px'});
            // $('#dapandung').prop('hidden',true);
        } else {
            top--;
            left--;
            elem.style.top = top + "px";
            elem.style.left = left + "px";
        }
    }
}
$('#loa').click(function () {
    var audio = new Audio('/template/thuvien/audio/chuso/so1.mp3');
    audio.play();

});

$('#kiemtraketqua').click(function () {
if(duocChon==1){
    var audio = new Audio('/template/thuvien/audio/chondung.mp3');
    audio.play();
    $('#thongbaodung').prop('hidden',false);
    $('#thongbaosai').prop('hidden',true);
    $('#cautiep').prop('hidden',false);

}else {
    var audio = new Audio('/template/thuvien/audio/chonsai.mp3');
    audio.play();
    $('#thongbaosai').prop('hidden',false);
    $('#thongbaodung').prop('hidden',true);
    $('#cautiep').prop('hidden',true);
}
});

$('#cogiao').click(function () {
    var audio = new Audio('/template/thuvien/audio/huongdannghe.mp3');
    audio.play();
});

$('#cautiep').click(function () {
    $('#dapan1').attr({"style":"background-image: url(/template/thuvien/hinhanh/chuso/so7.jpg)",});
    $('#dapan2').attr({"style":"background-image: url(/template/thuvien/hinhanh/chuso/so4.jpg)",});
    $('#dapan3').attr({"style":"background-image: url(/template/thuvien/hinhanh/chuso/so8.jpg)",});
    $('#dapan4').attr({"style":"background-image: url(/template/thuvien/hinhanh/chuso/so9.jpg)",});

    $('#loa').click(function () {
        var audio = new Audio('/template/thuvien/audio/chuso/so2.mp3');
        audio.play();
    });
});