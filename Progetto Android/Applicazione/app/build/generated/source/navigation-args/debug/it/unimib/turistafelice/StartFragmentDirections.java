package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class StartFragmentDirections {
  private StartFragmentDirections() {
  }

  @NonNull
  public static NotLoggedAction notLoggedAction() {
    return new NotLoggedAction();
  }

  @NonNull
  public static LoggedAction loggedAction() {
    return new LoggedAction();
  }

  public static class NotLoggedAction implements NavDirections {
    private final HashMap arguments = new HashMap();

    private NotLoggedAction() {
    }

    @NonNull
    public NotLoggedAction setNotLogged(boolean notLogged) {
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
      return R.id.notLoggedAction;
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
      NotLoggedAction that = (NotLoggedAction) object;
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
      return "NotLoggedAction(actionId=" + getActionId() + "){"
          + "notLogged=" + getNotLogged()
          + "}";
    }
  }

  public static class LoggedAction implements NavDirections {
    private final HashMap arguments = new HashMap();

    private LoggedAction() {
    }

    @NonNull
    public LoggedAction setLogged(boolean logged) {
      this.arguments.put("logged", logged);
      return this;
    }

    @NonNull
    public LoggedAction setRegisteredSuccess(boolean registeredSuccess) {
      this.arguments.put("registeredSuccess", registeredSuccess);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("logged")) {
        boolean logged = (boolean) arguments.get("logged");
        __result.putBoolean("logged", logged);
      } else {
        __result.putBoolean("logged", true);
      }
      if (arguments.containsKey("registeredSuccess")) {
        boolean registeredSuccess = (boolean) arguments.get("registeredSuccess");
        __result.putBoolean("registeredSuccess", registeredSuccess);
      } else {
        __result.putBoolean("registeredSuccess", true);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.loggedAction;
    }

    @SuppressWarnings("unchecked")
    public boolean getLogged() {
      return (boolean) arguments.get("logged");
    }

    @SuppressWarnings("unchecked")
    public boolean getRegisteredSuccess() {
      return (boolean) arguments.get("registeredSuccess");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      LoggedAction that = (LoggedAction) object;
      if (arguments.containsKey("logged") != that.arguments.containsKey("logged")) {
        return false;
      }
      if (getLogged() != that.getLogged()) {
        return false;
      }
      if (arguments.containsKey("registeredSuccess") != that.arguments.containsKey("registeredSuccess")) {
        return false;
      }
      if (getRegisteredSuccess() != that.getRegisteredSuccess()) {
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
      result = 31 * result + (getLogged() ? 1 : 0);
      result = 31 * result + (getRegisteredSuccess() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "LoggedAction(actionId=" + getActionId() + "){"
          + "logged=" + getLogged()
          + ", registeredSuccess=" + getRegisteredSuccess()
          + "}";
    }
  }
}
