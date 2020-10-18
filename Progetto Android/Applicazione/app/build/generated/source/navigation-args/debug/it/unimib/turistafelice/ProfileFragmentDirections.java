package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProfileFragmentDirections {
  private ProfileFragmentDirections() {
  }

  @NonNull
  public static ShowInterestsAction showInterestsAction() {
    return new ShowInterestsAction();
  }

  @NonNull
  public static LogoutAction logoutAction() {
    return new LogoutAction();
  }

  public static class ShowInterestsAction implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ShowInterestsAction() {
    }

    @NonNull
    public ShowInterestsAction setTt(boolean tt) {
      this.arguments.put("tt", tt);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("tt")) {
        boolean tt = (boolean) arguments.get("tt");
        __result.putBoolean("tt", tt);
      } else {
        __result.putBoolean("tt", true);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.showInterestsAction;
    }

    @SuppressWarnings("unchecked")
    public boolean getTt() {
      return (boolean) arguments.get("tt");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ShowInterestsAction that = (ShowInterestsAction) object;
      if (arguments.containsKey("tt") != that.arguments.containsKey("tt")) {
        return false;
      }
      if (getTt() != that.getTt()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getTt() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ShowInterestsAction(actionId=" + getActionId() + "){"
          + "tt=" + getTt()
          + "}";
    }
  }

  public static class LogoutAction implements NavDirections {
    private final HashMap arguments = new HashMap();

    private LogoutAction() {
    }

    @NonNull
    public LogoutAction setNotLogged(boolean notLogged) {
      this.arguments.put("notLogged", notLogged);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("notLogged")) {
        boolean notLogged = (boolean) arguments.get("notLogged");
        __result.putBoolean("notLogged", notLogged);
      } else {
        __result.putBoolean("notLogged", true);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.logoutAction;
    }

    @SuppressWarnings("unchecked")
    public boolean getNotLogged() {
      return (boolean) arguments.get("notLogged");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      LogoutAction that = (LogoutAction) object;
      if (arguments.containsKey("notLogged") != that.arguments.containsKey("notLogged")) {
        return false;
      }
      if (getNotLogged() != that.getNotLogged()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getNotLogged() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "LogoutAction(actionId=" + getActionId() + "){"
          + "notLogged=" + getNotLogged()
          + "}";
    }
  }
}
