package de.furryhome.WUApiLib;

public class Constants {
	public static class AddServiceFlag {
		public static final int asfAllowPendingRegistration = 1;
		public static final int asfAllowOnlineRegistration = 2;
		public static final int asfRegisterServiceWithAU = 4;
	}
	
	public static class AutoDownloadMode {
		public static final int adLetWindowsUpdateDecide = 0;
		public static final int adNeverAutoDownload = 1;
		public static final int adAlwaysAutoDownload = 2;
	}
	
	public static class AutomaticUpdatesNotificationLevel {
		public static final int aunlNotConfigured = 0;
		public static final int aunlDisabled = 1;
		public static final int aunlNotifyBeforeDownload = 2;
		public static final int aunlNotifyBeforeInstallation = 3;
		public static final int aunlScheduledInstallation = 4;
	}
	
	public static class AutomaticUpdatesPermissionsType {
		public static final int auptSetNotificationLevel = 1;
		public static final int auptDisableAutomaticUpdates = 2;
		public static final int auptSetIncludeRecommendedUpdates = 3;
		public static final int auptSetFeaturedUpdatesEnabled = 4;
		public static final int auptSetNonAdministratorsElevated = 5;
	}
	
	public static class AutomaticUpdatesScheduledInstallationDay {
		public static final int ausidEveryDay = 0;
		public static final int ausidEverySunday = 1;
		public static final int ausidEveryMonday = 2;
		public static final int ausidEveryTuesday = 3;
		public static final int ausidEveryWednesday = 4;
		public static final int ausidEveryThursday = 5;
		public static final int ausidEveryFriday = 6;
		public static final int ausidEverySaturday = 7;
	}
	
	public static class AutomaticUpdatesUserType {
		public static final int auutCurrentUser = 1;
		public static final int auutLocalAdministrator = 2;
	}
	
	public static class AutoSelectionMode {
		public static final int asLetWindowsUpdateDecide = 0;
		public static final int asAutoSelectIfDownloaded = 1;
		public static final int asNeverAutoSelect = 2;
		public static final int asAlwaysAutoSelect = 3;
	}
	
	public static class DeploymentAction {
		public static final int daNone = 0;
		public static final int daInstallation = 1;
		public static final int daUninstallation = 2;
		public static final int daDetection = 3;
	}
	
	public static class DownloadPhase {
		public static final int dphInitializing = 1;
		public static final int dphDownloading = 2;
		public static final int dphVerifying = 3;
	}
	
	public static class Downloadpriority {
		public static final int dpLow = 1;
		public static final int dpNormal = 2;
		public static final int dpHigh = 3;
	}
	
	public static class InstallationImpact {
		public static final int iiNormal = 0;
		public static final int iiMinor = 1;
		public static final int iiRequiresExclusiveHandling = 2;
	}
	
	public static class InstallationRebootBehavior {
		public static final int irbNeverReboots = 0;
		public static final int irbAlwaysRequiresReboot = 1;
		public static final int irbCanRequestReboot = 2;
	}
	
	public static class OperationResultCode {
		public static final int orcNotStarted = 0;
		public static final int orcInProgress = 1;
		public static final int orcSucceeded = 2;
		public static final int orcSucceededWithErrors = 3;
		public static final int orcFailed = 4;
		public static final int orcAborted = 5;
	}
	
	public static class SearchScope {
		public static final int searchScopeDefault = 0;
		public static final int searchScopeMachineOnly = 1;
		public static final int searchScopeCurrentUserOnly = 2;
		public static final int searchScopeMachineAndCurrentUser = 3;
		public static final int searchScopeMachineAndAllUsers = 4;
		public static final int searchScopeAllUsers = 5;
	}
	
	public static class ServerSelection {
		public static final int ssDefault = 0;
		public static final int ssManagedServer = 1;
		public static final int ssWindowsUpdate = 2;
		public static final int ssOthers = 3;
	}
	
	public static class tagAddServiceFlag {
		public static final int asfAllowPendingRegistration = 1;
		public static final int asfAllowOnlineRegistration = 2;
		public static final int asfRegisterServiceWithAU = 4;
	}
	
	public static class tagAutoDownloadMode {
		public static final int adLetWindowsUpdateDecide = 0;
		public static final int adNeverAutoDownload = 1;
		public static final int adAlwaysAutoDownload = 2;
	}
	
	public static class tagAutomaticUpdatesNotificationLevel {
		public static final int aunlNotConfigured = 0;
		public static final int aunlDisabled = 1;
		public static final int aunlNotifyBeforeDownload = 2;
		public static final int aunlNotifyBeforeInstallation = 3;
		public static final int aunlScheduledInstallation = 4;
	}
	
	public static class tagAutomaticUpdatesPermissionType {
		public static final int auptSetNotificationLevel = 1;
		public static final int auptDisableAutomaticUpdates = 2;
		public static final int auptSetIncludeRecommendedUpdates = 3;
		public static final int auptSetFeaturedUpdatesEnabled = 4;
		public static final int auptSetNonAdministratorsElevated = 5;
	}
	
	public static class tagAutomaticUpdatesScheduledInstallationDay {
		public static final int ausidEveryDay = 0;
		public static final int ausidEverySunday = 1;
		public static final int ausidEveryMonday = 2;
		public static final int ausidEveryTuesday = 3;
		public static final int ausidEveryWednesday = 4;
		public static final int ausidEveryThursday = 5;
		public static final int ausidEveryFriday = 6;
		public static final int ausidEverySaturday = 7;
	}
	
	public static class tagAutomaticUpdatesUserType {
		public static final int auutCurrentUser = 1;
		public static final int auutLocalAdministrator = 2;
	}
	
	public static class tagAutoSelectionMode {
		public static final int asLetWindowsUpdateDecide = 0;
		public static final int asAutoSelectIfDownloaded = 1;
		public static final int asNeverAutoSelect = 2;
		public static final int asAlwaysAutoSelect = 3;
	}
	
	public static class tagDeploymentAction {
		public static final int daNone = 0;
		public static final int daInstallation = 1;
		public static final int daUninstallation = 2;
		public static final int daDetection = 3;
	}
	
	public static class tagDownloadPhase {
		public static final int dphInitializing = 1;
		public static final int dphDownloading = 2;
		public static final int dphVerifying = 3;
	}
}
