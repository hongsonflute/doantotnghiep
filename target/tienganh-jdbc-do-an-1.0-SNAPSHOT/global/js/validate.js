function validateAddUser() {
    var fullname = document.getElementById('fullname').value;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var roleid = document.getElementById('roleid').value;

    if (fullname == "" || fullname.length < 6) {
        document.getElementById("showMsg_fullname").innerHTML = "Họ và tên  tối thiểu 6 ký tự!";
        this.fullname.focus();
        return false;
    } else {
        document.getElementById("showMsg_fullname").innerHTML = "";
    }
    if (roleid == "") {
        document.getElementById("showMsg_role").innerHTML = "Bạn phải chọn 1 loại quyền!";
        return false;
    } else {
        document.getElementById("showMsg_role").innerHTML = "";
    }
    if (username == "" || username.length < 6) {
        document.getElementById("showMsg_username").innerHTML = "Tên đăng nhập  tối thiểu 6 ký tự!";
        this.username.focus();
        return false;
    } else {
        document.getElementById("showMsg_username").innerHTML = "";
    }
    if (password == "" || password.length < 6) {
        document.getElementById("showMsg_password").innerHTML = "Mật khẩu  tối thiểu 6 ký tự!";
        this.password.focus();
        return false;
    } else {
        document.getElementById("showMsg_password").innerHTML = "";
    }

    return true;
}

function validateRegister() {
    var fullname = document.getElementById('fullname').value;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    if (fullname == "" || fullname.length < 6) {
        document.getElementById("showMsg_fullname").innerHTML = "Họ và tên  tối thiểu 6 ký tự!";
        this.fullname.focus();
        return false;
    } else {
        document.getElementById("showMsg_fullname").innerHTML = "";
    }

    if (username == "" || username.length < 6) {
        document.getElementById("showMsg_username").innerHTML = "Tên đăng nhập  tối thiểu 6 ký tự!";
        this.username.focus();
        return false;
    } else {
        document.getElementById("showMsg_username").innerHTML = "";
    }
    if (password == "" || password.length < 6) {
        document.getElementById("showMsg_password").innerHTML = "Mật khẩu  tối thiểu 6 ký tự!";
        this.password.focus();
        return false;
    } else {
        document.getElementById("showMsg_password").innerHTML = "";
    }
    return true;
}

function validateLogin() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    if (username == "" || username.length < 6) {
        document.getElementById("showMsg_username").innerHTML = "Tên đăng nhập  tối thiểu 6 ký tự!";
        this.username.focus();
        return false;
    } else {
        document.getElementById("showMsg_username").innerHTML = "";
    }
    if (password == "" || password.length < 6) {
        document.getElementById("showMsg_password").innerHTML = "Mật khẩu  tối thiểu 6 ký tự!";
        this.password.focus();
        return false;
    } else {
        document.getElementById("showMsg_password").innerHTML = "";
    }
    return true;
}

enableOrDisableDeleteAllLes();
enableOrDisableDeleteAllUser();
autoCheckBoxChild();
autoCheckBoxParent();
enableOrDisableDuyet();
enableOrDisableHuyDuyet();
$('#uploadImage').change(function () {
    var dataArray = {};
    var files = $(this)[0].files[0];
    if (files != undefined) {
        var reader = new FileReader();
        reader.onload = function (e) {
            dataArray["base64"] = e.target.result;
            dataArray["name"] = files.name;
            uploadFile(dataArray);
        };
        reader.readAsDataURL(files);
    }
});
$('#videoUpload').change(function () {
    var dataArray = {};
    var files = $(this)[0].files[0];
    if (files != undefined) {
        var reader = new FileReader();
        reader.onload = function (e) {
            dataArray["base64"] = e.target.result;
            dataArray["name"] = files.name;
            uploadFile(dataArray);
        };
        reader.readAsDataURL(files);
    }
});

function uploadFile(data) {
    $.ajax({
        url: '/upload-file',
        type: 'POST',
        data: JSON.stringify(data),
        contentType: 'application/json',
        success: function (res) {
            console.log(res);
            $('#kq-upload').html("<label style='color: blue'>up  thành công</label>");
        },
        error: function (res) {
            console.log(res);
            $('#kq-upload').html("<label style='color: red'>up  thất bại</label>");
        }
    });
}


$('#btnDeleteUser').click(function (e) {
    var kqXoa = confirm("Bạn có chắc muốn xóa không?");
    e.preventDefault();
    if (kqXoa == true) {
        var dataArray = $(' tbody input[type=checkbox]:checked').map(function () {
            return $(this).val();
        }).get();
        var data = {};
        data["ids"] = dataArray;
        $.ajax({
            url: '/admin-list-account',
            type: 'DELETE',
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            success: function (result) {
                /*console.log("thanh cong");
                window.location.reload(true);*/
                window.location.href = "/admin-list-account?action=list&msg=xoathanhcong";
            },
            error: function (error) {
                console.log("that bai");
                window.location.href = "/admin-list-account?action=list&msg=xoathatbai";
            }
        });
    }
    else {
        return false;
    }
});


$('#btnDeleteLession').click(function (e) {
    var kqXoa = confirm("Bạn có chắc muốn xóa không?");
    e.preventDefault();
    if (kqXoa == true) {
        var dataArray = $(' tbody input[type=checkbox]:checked').map(function () {
            return $(this).val();
        }).get();
        var data = {};
        data["ids"] = dataArray;
        $.ajax({
            url: '/admin-list-lession',
            type: 'DELETE',
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            success: function (result) {
                /*console.log("thanh cong");
                window.location.reload(true);*/
                console.log(result);
                window.location.href = "/admin-list-lession?action=list&msg=" + result;
            },
            error: function (error) {
                console.log(error);
            }
        });
    }
    else {
        return false;
    }
});

$('#btnDuyet').click(function (e) {
    var kqDuyet = confirm("Bạn có chắc muốn duyệt không?");
    e.preventDefault();
    if (kqDuyet == true) {
        var dataArray = $(' tbody input[type=checkbox]:checked').map(function () {
            return $(this).val();
        }).get();
        var data = {};
        data["ids"] = dataArray;
        $.ajax({
            url: '/admin-list-lession',
            type: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            success: function (result) {
                /*console.log("thanh cong");
                window.location.reload(true);*/
                console.log(result);
                window.location.href = "/admin-list-lession?action=list&msg=" + result;
                alert("Duyệt Thành công!")
            },
            error: function (error) {
                console.log(error);
            }
        });
    }
    else {
        return false;
    }
});



$('#btnHuyDuyet').click(function (e) {
    var kqDuyet = confirm("Bạn có chắc muốn hủy duyệt không?");
    e.preventDefault();
    if (kqDuyet == true) {
        var dataArray = $(' tbody input[type=checkbox]:checked').map(function () {
            return $(this).val();
        }).get();
        var data = {};
        data["ids"] = dataArray;
        $.ajax({
            url: '/admin-list-lession',
            type: 'OPTIONS',
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            success: function (result) {
                /*console.log("thanh cong");
                window.location.reload(true);*/
                console.log(result);
                window.location.href = "/admin-list-lession?action=list&msg=" + result;
                alert("Hủy Duyệt Thành công!")
            },
            error: function (error) {
                console.log(error);
            }
        });
    }
    else {
        return false;
    }
});

/*-----------------------------*/

function enableOrDisableDeleteAllUser() {
    $('input[type=checkbox]').click(function () {
        if ($('input[type=checkbox]:checked').length > 0) {
            $('#btnDeleteUser').prop('disabled', false);
            $('#btnDeleteUser').css("background-color", "#E8E8E8");
        } else {
            $('#btnDeleteUser').prop('disabled', true);
            $('#btnDeleteUser').css("background-color", "");
        }
    });
}

function enableOrDisableSuaAll() {
    $('input[type=checkbox]').click(function () {
        if ($('input[type=checkbox]:checked').length > 0) {
            $('#btnSua').prop('disabled', false);
            $('#btnSua').css("background-color", "#E8E8E8");
        } else {
            $('#btnSua').prop('disabled', true);
            $('#btnSua').css("background-color", "");
        }
    });
}

function autoCheckBoxChild() {
    $('#checkAll').change(function () {
        if ((this).checked) {
            $(this).closest('table').find('tbody input[type=checkbox]').prop('checked', true);
        } else {
            $(this).closest('table').find('tbody input[type=checkbox]').prop('checked', false);
            $('#btnDeleteUser').prop('disabled', true);
            $('#btnSua').prop('disabled', true);
            $('#btnDeleteLession').prop('disabled', true);
        }
    });
}

function autoCheckBoxParent() {
    var totalCheckboxChild = $('#checkAll').closest('table').find('tbody input[type=checkbox]').length;
    $('#checkAll').closest('table').find('tbody input[type=checkbox]').each(function () {
        $(this).on('change', function () {
            var totalCheckboxChecked = $('#checkAll').closest('table').find('tbody input[type=checkbox]:checked').length;
            if (totalCheckboxChild == totalCheckboxChecked) {
                $('#checkAll').prop('checked', true);
            } else {
                $('#checkAll').prop('checked', false);
            }
        });
    });
}


function enableOrDisableDeleteAllLes() {
    $('input[type=checkbox]').click(function () {
        if ($('input[type=checkbox]:checked').length > 0) {
            $('#btnDeleteLession').prop('disabled', false);
            $('#btnDeleteLession').css("background-color", "#E8E8E8");
        } else {
            $('#btnDeleteLession').prop('disabled', true);
            $('#btnDeleteLession').css("background-color", "");
        }
    });
}

function enableOrDisableSuaAll() {
    $('input[type=checkbox]').click(function () {
        if ($('input[type=checkbox]:checked').length > 0) {
            $('#btnSua').prop('disabled', false);
            $('#btnSua').css("background-color", "#E8E8E8");
        } else {
            $('#btnSua').prop('disabled', true);
            $('#btnSua').css("background-color", "");
        }
    });
}

function enableOrDisableDuyet() {
    $('input[type=checkbox]').click(function () {
        if ($('input[type=checkbox]:checked').length > 0) {
            $('#btnDuyet').prop('disabled', false);
            $('#btnDuyet').css("background-color", "#E8E8E8");
        } else {
            $('#btnDuyet').prop('disabled', true);
            $('#btnDuyet').css("background-color", "");
        }
    });
}
function enableOrDisableHuyDuyet() {
    $('input[type=checkbox]').click(function () {
        if ($('input[type=checkbox]:checked').length > 0) {
            $('#btnHuyDuyet').prop('disabled', false);
            $('#btnHuyDuyet').css("background-color", "#E8E8E8");
        } else {
            $('#btnHuyDuyet').prop('disabled', true);
            $('#btnHuyDuyet').css("background-color", "");
        }
    });
}