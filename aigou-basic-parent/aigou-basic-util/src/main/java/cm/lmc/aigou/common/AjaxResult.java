package cm.lmc.aigou.common;

public class AjaxResult {
    private Boolean success =true;
    private String msg="操作成功";
    private Object object;

    public static AjaxResult succeed(Object object){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setObject(object);
        return ajaxResult ;
    }
    public static AjaxResult mistake(String msg,Object object){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setSuccess(false);
        ajaxResult.setMsg(msg);
        ajaxResult.setObject(object);
        return ajaxResult;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
