/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.14.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.PolicyV1beta1AllowedCSIDriver;
import io.kubernetes.client.models.PolicyV1beta1AllowedFlexVolume;
import io.kubernetes.client.models.PolicyV1beta1AllowedHostPath;
import io.kubernetes.client.models.PolicyV1beta1FSGroupStrategyOptions;
import io.kubernetes.client.models.PolicyV1beta1HostPortRange;
import io.kubernetes.client.models.PolicyV1beta1RunAsGroupStrategyOptions;
import io.kubernetes.client.models.PolicyV1beta1RunAsUserStrategyOptions;
import io.kubernetes.client.models.PolicyV1beta1SELinuxStrategyOptions;
import io.kubernetes.client.models.PolicyV1beta1SupplementalGroupsStrategyOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PodSecurityPolicySpec defines the policy enforced.
 */
@ApiModel(description = "PodSecurityPolicySpec defines the policy enforced.")

public class PolicyV1beta1PodSecurityPolicySpec {
  @SerializedName("allowPrivilegeEscalation")
  private Boolean allowPrivilegeEscalation = null;

  @SerializedName("allowedCSIDrivers")
  private List<PolicyV1beta1AllowedCSIDriver> allowedCSIDrivers = null;

  @SerializedName("allowedCapabilities")
  private List<String> allowedCapabilities = null;

  @SerializedName("allowedFlexVolumes")
  private List<PolicyV1beta1AllowedFlexVolume> allowedFlexVolumes = null;

  @SerializedName("allowedHostPaths")
  private List<PolicyV1beta1AllowedHostPath> allowedHostPaths = null;

  @SerializedName("allowedProcMountTypes")
  private List<String> allowedProcMountTypes = null;

  @SerializedName("allowedUnsafeSysctls")
  private List<String> allowedUnsafeSysctls = null;

  @SerializedName("defaultAddCapabilities")
  private List<String> defaultAddCapabilities = null;

  @SerializedName("defaultAllowPrivilegeEscalation")
  private Boolean defaultAllowPrivilegeEscalation = null;

  @SerializedName("forbiddenSysctls")
  private List<String> forbiddenSysctls = null;

  @SerializedName("fsGroup")
  private PolicyV1beta1FSGroupStrategyOptions fsGroup = null;

  @SerializedName("hostIPC")
  private Boolean hostIPC = null;

  @SerializedName("hostNetwork")
  private Boolean hostNetwork = null;

  @SerializedName("hostPID")
  private Boolean hostPID = null;

  @SerializedName("hostPorts")
  private List<PolicyV1beta1HostPortRange> hostPorts = null;

  @SerializedName("privileged")
  private Boolean privileged = null;

  @SerializedName("readOnlyRootFilesystem")
  private Boolean readOnlyRootFilesystem = null;

  @SerializedName("requiredDropCapabilities")
  private List<String> requiredDropCapabilities = null;

  @SerializedName("runAsGroup")
  private PolicyV1beta1RunAsGroupStrategyOptions runAsGroup = null;

  @SerializedName("runAsUser")
  private PolicyV1beta1RunAsUserStrategyOptions runAsUser = null;

  @SerializedName("seLinux")
  private PolicyV1beta1SELinuxStrategyOptions seLinux = null;

  @SerializedName("supplementalGroups")
  private PolicyV1beta1SupplementalGroupsStrategyOptions supplementalGroups = null;

  @SerializedName("volumes")
  private List<String> volumes = null;

  public PolicyV1beta1PodSecurityPolicySpec allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

   /**
   * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.
   * @return allowPrivilegeEscalation
  **/
  @ApiModelProperty(value = "allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.")
  public Boolean isAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }

  public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
  }

  public PolicyV1beta1PodSecurityPolicySpec allowedCSIDrivers(List<PolicyV1beta1AllowedCSIDriver> allowedCSIDrivers) {
    this.allowedCSIDrivers = allowedCSIDrivers;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addAllowedCSIDriversItem(PolicyV1beta1AllowedCSIDriver allowedCSIDriversItem) {
    if (this.allowedCSIDrivers == null) {
      this.allowedCSIDrivers = new ArrayList<PolicyV1beta1AllowedCSIDriver>();
    }
    this.allowedCSIDrivers.add(allowedCSIDriversItem);
    return this;
  }

   /**
   * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value means no CSI drivers can run inline within a pod spec.
   * @return allowedCSIDrivers
  **/
  @ApiModelProperty(value = "AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value means no CSI drivers can run inline within a pod spec.")
  public List<PolicyV1beta1AllowedCSIDriver> getAllowedCSIDrivers() {
    return allowedCSIDrivers;
  }

  public void setAllowedCSIDrivers(List<PolicyV1beta1AllowedCSIDriver> allowedCSIDrivers) {
    this.allowedCSIDrivers = allowedCSIDrivers;
  }

  public PolicyV1beta1PodSecurityPolicySpec allowedCapabilities(List<String> allowedCapabilities) {
    this.allowedCapabilities = allowedCapabilities;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addAllowedCapabilitiesItem(String allowedCapabilitiesItem) {
    if (this.allowedCapabilities == null) {
      this.allowedCapabilities = new ArrayList<String>();
    }
    this.allowedCapabilities.add(allowedCapabilitiesItem);
    return this;
  }

   /**
   * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author&#39;s discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
   * @return allowedCapabilities
  **/
  @ApiModelProperty(value = "allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.")
  public List<String> getAllowedCapabilities() {
    return allowedCapabilities;
  }

  public void setAllowedCapabilities(List<String> allowedCapabilities) {
    this.allowedCapabilities = allowedCapabilities;
  }

  public PolicyV1beta1PodSecurityPolicySpec allowedFlexVolumes(List<PolicyV1beta1AllowedFlexVolume> allowedFlexVolumes) {
    this.allowedFlexVolumes = allowedFlexVolumes;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addAllowedFlexVolumesItem(PolicyV1beta1AllowedFlexVolume allowedFlexVolumesItem) {
    if (this.allowedFlexVolumes == null) {
      this.allowedFlexVolumes = new ArrayList<PolicyV1beta1AllowedFlexVolume>();
    }
    this.allowedFlexVolumes.add(allowedFlexVolumesItem);
    return this;
  }

   /**
   * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \&quot;volumes\&quot; field.
   * @return allowedFlexVolumes
  **/
  @ApiModelProperty(value = "allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \"volumes\" field.")
  public List<PolicyV1beta1AllowedFlexVolume> getAllowedFlexVolumes() {
    return allowedFlexVolumes;
  }

  public void setAllowedFlexVolumes(List<PolicyV1beta1AllowedFlexVolume> allowedFlexVolumes) {
    this.allowedFlexVolumes = allowedFlexVolumes;
  }

  public PolicyV1beta1PodSecurityPolicySpec allowedHostPaths(List<PolicyV1beta1AllowedHostPath> allowedHostPaths) {
    this.allowedHostPaths = allowedHostPaths;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addAllowedHostPathsItem(PolicyV1beta1AllowedHostPath allowedHostPathsItem) {
    if (this.allowedHostPaths == null) {
      this.allowedHostPaths = new ArrayList<PolicyV1beta1AllowedHostPath>();
    }
    this.allowedHostPaths.add(allowedHostPathsItem);
    return this;
  }

   /**
   * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.
   * @return allowedHostPaths
  **/
  @ApiModelProperty(value = "allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.")
  public List<PolicyV1beta1AllowedHostPath> getAllowedHostPaths() {
    return allowedHostPaths;
  }

  public void setAllowedHostPaths(List<PolicyV1beta1AllowedHostPath> allowedHostPaths) {
    this.allowedHostPaths = allowedHostPaths;
  }

  public PolicyV1beta1PodSecurityPolicySpec allowedProcMountTypes(List<String> allowedProcMountTypes) {
    this.allowedProcMountTypes = allowedProcMountTypes;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addAllowedProcMountTypesItem(String allowedProcMountTypesItem) {
    if (this.allowedProcMountTypes == null) {
      this.allowedProcMountTypes = new ArrayList<String>();
    }
    this.allowedProcMountTypes.add(allowedProcMountTypesItem);
    return this;
  }

   /**
   * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
   * @return allowedProcMountTypes
  **/
  @ApiModelProperty(value = "AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.")
  public List<String> getAllowedProcMountTypes() {
    return allowedProcMountTypes;
  }

  public void setAllowedProcMountTypes(List<String> allowedProcMountTypes) {
    this.allowedProcMountTypes = allowedProcMountTypes;
  }

  public PolicyV1beta1PodSecurityPolicySpec allowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
    this.allowedUnsafeSysctls = allowedUnsafeSysctls;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addAllowedUnsafeSysctlsItem(String allowedUnsafeSysctlsItem) {
    if (this.allowedUnsafeSysctls == null) {
      this.allowedUnsafeSysctls = new ArrayList<String>();
    }
    this.allowedUnsafeSysctls.add(allowedUnsafeSysctlsItem);
    return this;
  }

   /**
   * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.  Examples: e.g. \&quot;foo/_*\&quot; allows \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g. \&quot;foo.*\&quot; allows \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc.
   * @return allowedUnsafeSysctls
  **/
  @ApiModelProperty(value = "allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \"*\" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.  Examples: e.g. \"foo/_*\" allows \"foo/bar\", \"foo/baz\", etc. e.g. \"foo.*\" allows \"foo.bar\", \"foo.baz\", etc.")
  public List<String> getAllowedUnsafeSysctls() {
    return allowedUnsafeSysctls;
  }

  public void setAllowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
    this.allowedUnsafeSysctls = allowedUnsafeSysctls;
  }

  public PolicyV1beta1PodSecurityPolicySpec defaultAddCapabilities(List<String> defaultAddCapabilities) {
    this.defaultAddCapabilities = defaultAddCapabilities;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addDefaultAddCapabilitiesItem(String defaultAddCapabilitiesItem) {
    if (this.defaultAddCapabilities == null) {
      this.defaultAddCapabilities = new ArrayList<String>();
    }
    this.defaultAddCapabilities.add(defaultAddCapabilitiesItem);
    return this;
  }

   /**
   * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
   * @return defaultAddCapabilities
  **/
  @ApiModelProperty(value = "defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.")
  public List<String> getDefaultAddCapabilities() {
    return defaultAddCapabilities;
  }

  public void setDefaultAddCapabilities(List<String> defaultAddCapabilities) {
    this.defaultAddCapabilities = defaultAddCapabilities;
  }

  public PolicyV1beta1PodSecurityPolicySpec defaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
    return this;
  }

   /**
   * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
   * @return defaultAllowPrivilegeEscalation
  **/
  @ApiModelProperty(value = "defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.")
  public Boolean isDefaultAllowPrivilegeEscalation() {
    return defaultAllowPrivilegeEscalation;
  }

  public void setDefaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
  }

  public PolicyV1beta1PodSecurityPolicySpec forbiddenSysctls(List<String> forbiddenSysctls) {
    this.forbiddenSysctls = forbiddenSysctls;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addForbiddenSysctlsItem(String forbiddenSysctlsItem) {
    if (this.forbiddenSysctls == null) {
      this.forbiddenSysctls = new ArrayList<String>();
    }
    this.forbiddenSysctls.add(forbiddenSysctlsItem);
    return this;
  }

   /**
   * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.  Examples: e.g. \&quot;foo/_*\&quot; forbids \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g. \&quot;foo.*\&quot; forbids \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc.
   * @return forbiddenSysctls
  **/
  @ApiModelProperty(value = "forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \"*\" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.  Examples: e.g. \"foo/_*\" forbids \"foo/bar\", \"foo/baz\", etc. e.g. \"foo.*\" forbids \"foo.bar\", \"foo.baz\", etc.")
  public List<String> getForbiddenSysctls() {
    return forbiddenSysctls;
  }

  public void setForbiddenSysctls(List<String> forbiddenSysctls) {
    this.forbiddenSysctls = forbiddenSysctls;
  }

  public PolicyV1beta1PodSecurityPolicySpec fsGroup(PolicyV1beta1FSGroupStrategyOptions fsGroup) {
    this.fsGroup = fsGroup;
    return this;
  }

   /**
   * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
   * @return fsGroup
  **/
  @ApiModelProperty(required = true, value = "fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.")
  public PolicyV1beta1FSGroupStrategyOptions getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(PolicyV1beta1FSGroupStrategyOptions fsGroup) {
    this.fsGroup = fsGroup;
  }

  public PolicyV1beta1PodSecurityPolicySpec hostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return this;
  }

   /**
   * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
   * @return hostIPC
  **/
  @ApiModelProperty(value = "hostIPC determines if the policy allows the use of HostIPC in the pod spec.")
  public Boolean isHostIPC() {
    return hostIPC;
  }

  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }

  public PolicyV1beta1PodSecurityPolicySpec hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

   /**
   * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
   * @return hostNetwork
  **/
  @ApiModelProperty(value = "hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.")
  public Boolean isHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public PolicyV1beta1PodSecurityPolicySpec hostPID(Boolean hostPID) {
    this.hostPID = hostPID;
    return this;
  }

   /**
   * hostPID determines if the policy allows the use of HostPID in the pod spec.
   * @return hostPID
  **/
  @ApiModelProperty(value = "hostPID determines if the policy allows the use of HostPID in the pod spec.")
  public Boolean isHostPID() {
    return hostPID;
  }

  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }

  public PolicyV1beta1PodSecurityPolicySpec hostPorts(List<PolicyV1beta1HostPortRange> hostPorts) {
    this.hostPorts = hostPorts;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addHostPortsItem(PolicyV1beta1HostPortRange hostPortsItem) {
    if (this.hostPorts == null) {
      this.hostPorts = new ArrayList<PolicyV1beta1HostPortRange>();
    }
    this.hostPorts.add(hostPortsItem);
    return this;
  }

   /**
   * hostPorts determines which host port ranges are allowed to be exposed.
   * @return hostPorts
  **/
  @ApiModelProperty(value = "hostPorts determines which host port ranges are allowed to be exposed.")
  public List<PolicyV1beta1HostPortRange> getHostPorts() {
    return hostPorts;
  }

  public void setHostPorts(List<PolicyV1beta1HostPortRange> hostPorts) {
    this.hostPorts = hostPorts;
  }

  public PolicyV1beta1PodSecurityPolicySpec privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

   /**
   * privileged determines if a pod can request to be run as privileged.
   * @return privileged
  **/
  @ApiModelProperty(value = "privileged determines if a pod can request to be run as privileged.")
  public Boolean isPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public PolicyV1beta1PodSecurityPolicySpec readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

   /**
   * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
   * @return readOnlyRootFilesystem
  **/
  @ApiModelProperty(value = "readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.")
  public Boolean isReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }

  public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }

  public PolicyV1beta1PodSecurityPolicySpec requiredDropCapabilities(List<String> requiredDropCapabilities) {
    this.requiredDropCapabilities = requiredDropCapabilities;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addRequiredDropCapabilitiesItem(String requiredDropCapabilitiesItem) {
    if (this.requiredDropCapabilities == null) {
      this.requiredDropCapabilities = new ArrayList<String>();
    }
    this.requiredDropCapabilities.add(requiredDropCapabilitiesItem);
    return this;
  }

   /**
   * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
   * @return requiredDropCapabilities
  **/
  @ApiModelProperty(value = "requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.")
  public List<String> getRequiredDropCapabilities() {
    return requiredDropCapabilities;
  }

  public void setRequiredDropCapabilities(List<String> requiredDropCapabilities) {
    this.requiredDropCapabilities = requiredDropCapabilities;
  }

  public PolicyV1beta1PodSecurityPolicySpec runAsGroup(PolicyV1beta1RunAsGroupStrategyOptions runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

   /**
   * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod&#39;s RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
   * @return runAsGroup
  **/
  @ApiModelProperty(value = "RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.")
  public PolicyV1beta1RunAsGroupStrategyOptions getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(PolicyV1beta1RunAsGroupStrategyOptions runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public PolicyV1beta1PodSecurityPolicySpec runAsUser(PolicyV1beta1RunAsUserStrategyOptions runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

   /**
   * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
   * @return runAsUser
  **/
  @ApiModelProperty(required = true, value = "runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.")
  public PolicyV1beta1RunAsUserStrategyOptions getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(PolicyV1beta1RunAsUserStrategyOptions runAsUser) {
    this.runAsUser = runAsUser;
  }

  public PolicyV1beta1PodSecurityPolicySpec seLinux(PolicyV1beta1SELinuxStrategyOptions seLinux) {
    this.seLinux = seLinux;
    return this;
  }

   /**
   * seLinux is the strategy that will dictate the allowable labels that may be set.
   * @return seLinux
  **/
  @ApiModelProperty(required = true, value = "seLinux is the strategy that will dictate the allowable labels that may be set.")
  public PolicyV1beta1SELinuxStrategyOptions getSeLinux() {
    return seLinux;
  }

  public void setSeLinux(PolicyV1beta1SELinuxStrategyOptions seLinux) {
    this.seLinux = seLinux;
  }

  public PolicyV1beta1PodSecurityPolicySpec supplementalGroups(PolicyV1beta1SupplementalGroupsStrategyOptions supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

   /**
   * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
   * @return supplementalGroups
  **/
  @ApiModelProperty(required = true, value = "supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.")
  public PolicyV1beta1SupplementalGroupsStrategyOptions getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(PolicyV1beta1SupplementalGroupsStrategyOptions supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }

  public PolicyV1beta1PodSecurityPolicySpec volumes(List<String> volumes) {
    this.volumes = volumes;
    return this;
  }

  public PolicyV1beta1PodSecurityPolicySpec addVolumesItem(String volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<String>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use &#39;*&#39;.
   * @return volumes
  **/
  @ApiModelProperty(value = "volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.")
  public List<String> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<String> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyV1beta1PodSecurityPolicySpec policyV1beta1PodSecurityPolicySpec = (PolicyV1beta1PodSecurityPolicySpec) o;
    return Objects.equals(this.allowPrivilegeEscalation, policyV1beta1PodSecurityPolicySpec.allowPrivilegeEscalation) &&
        Objects.equals(this.allowedCSIDrivers, policyV1beta1PodSecurityPolicySpec.allowedCSIDrivers) &&
        Objects.equals(this.allowedCapabilities, policyV1beta1PodSecurityPolicySpec.allowedCapabilities) &&
        Objects.equals(this.allowedFlexVolumes, policyV1beta1PodSecurityPolicySpec.allowedFlexVolumes) &&
        Objects.equals(this.allowedHostPaths, policyV1beta1PodSecurityPolicySpec.allowedHostPaths) &&
        Objects.equals(this.allowedProcMountTypes, policyV1beta1PodSecurityPolicySpec.allowedProcMountTypes) &&
        Objects.equals(this.allowedUnsafeSysctls, policyV1beta1PodSecurityPolicySpec.allowedUnsafeSysctls) &&
        Objects.equals(this.defaultAddCapabilities, policyV1beta1PodSecurityPolicySpec.defaultAddCapabilities) &&
        Objects.equals(this.defaultAllowPrivilegeEscalation, policyV1beta1PodSecurityPolicySpec.defaultAllowPrivilegeEscalation) &&
        Objects.equals(this.forbiddenSysctls, policyV1beta1PodSecurityPolicySpec.forbiddenSysctls) &&
        Objects.equals(this.fsGroup, policyV1beta1PodSecurityPolicySpec.fsGroup) &&
        Objects.equals(this.hostIPC, policyV1beta1PodSecurityPolicySpec.hostIPC) &&
        Objects.equals(this.hostNetwork, policyV1beta1PodSecurityPolicySpec.hostNetwork) &&
        Objects.equals(this.hostPID, policyV1beta1PodSecurityPolicySpec.hostPID) &&
        Objects.equals(this.hostPorts, policyV1beta1PodSecurityPolicySpec.hostPorts) &&
        Objects.equals(this.privileged, policyV1beta1PodSecurityPolicySpec.privileged) &&
        Objects.equals(this.readOnlyRootFilesystem, policyV1beta1PodSecurityPolicySpec.readOnlyRootFilesystem) &&
        Objects.equals(this.requiredDropCapabilities, policyV1beta1PodSecurityPolicySpec.requiredDropCapabilities) &&
        Objects.equals(this.runAsGroup, policyV1beta1PodSecurityPolicySpec.runAsGroup) &&
        Objects.equals(this.runAsUser, policyV1beta1PodSecurityPolicySpec.runAsUser) &&
        Objects.equals(this.seLinux, policyV1beta1PodSecurityPolicySpec.seLinux) &&
        Objects.equals(this.supplementalGroups, policyV1beta1PodSecurityPolicySpec.supplementalGroups) &&
        Objects.equals(this.volumes, policyV1beta1PodSecurityPolicySpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPrivilegeEscalation, allowedCSIDrivers, allowedCapabilities, allowedFlexVolumes, allowedHostPaths, allowedProcMountTypes, allowedUnsafeSysctls, defaultAddCapabilities, defaultAllowPrivilegeEscalation, forbiddenSysctls, fsGroup, hostIPC, hostNetwork, hostPID, hostPorts, privileged, readOnlyRootFilesystem, requiredDropCapabilities, runAsGroup, runAsUser, seLinux, supplementalGroups, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyV1beta1PodSecurityPolicySpec {\n");
    
    sb.append("    allowPrivilegeEscalation: ").append(toIndentedString(allowPrivilegeEscalation)).append("\n");
    sb.append("    allowedCSIDrivers: ").append(toIndentedString(allowedCSIDrivers)).append("\n");
    sb.append("    allowedCapabilities: ").append(toIndentedString(allowedCapabilities)).append("\n");
    sb.append("    allowedFlexVolumes: ").append(toIndentedString(allowedFlexVolumes)).append("\n");
    sb.append("    allowedHostPaths: ").append(toIndentedString(allowedHostPaths)).append("\n");
    sb.append("    allowedProcMountTypes: ").append(toIndentedString(allowedProcMountTypes)).append("\n");
    sb.append("    allowedUnsafeSysctls: ").append(toIndentedString(allowedUnsafeSysctls)).append("\n");
    sb.append("    defaultAddCapabilities: ").append(toIndentedString(defaultAddCapabilities)).append("\n");
    sb.append("    defaultAllowPrivilegeEscalation: ").append(toIndentedString(defaultAllowPrivilegeEscalation)).append("\n");
    sb.append("    forbiddenSysctls: ").append(toIndentedString(forbiddenSysctls)).append("\n");
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostPorts: ").append(toIndentedString(hostPorts)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    readOnlyRootFilesystem: ").append(toIndentedString(readOnlyRootFilesystem)).append("\n");
    sb.append("    requiredDropCapabilities: ").append(toIndentedString(requiredDropCapabilities)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinux: ").append(toIndentedString(seLinux)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

